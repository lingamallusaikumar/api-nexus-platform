package com.apinexus.registry.massive.streamledger383;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streamledger383")
public class StreamLedger383Controller {
    private final StreamLedger383Service service;
    
    public StreamLedger383Controller(StreamLedger383Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamLedger383> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamLedger383 create(@RequestBody StreamLedger383 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamLedger383";
    }
}
