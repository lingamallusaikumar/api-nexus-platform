package com.apinexus.registry.massive.streamprocess7821;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streamprocess7821")
public class StreamProcess7821Controller {
    private final StreamProcess7821Service service;
    
    public StreamProcess7821Controller(StreamProcess7821Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamProcess7821> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamProcess7821 create(@RequestBody StreamProcess7821 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamProcess7821";
    }
}
