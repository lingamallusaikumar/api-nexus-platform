package com.apinexus.registry.massive.streamentry1670;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streamentry1670")
public class StreamEntry1670Controller {
    private final StreamEntry1670Service service;
    
    public StreamEntry1670Controller(StreamEntry1670Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamEntry1670> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamEntry1670 create(@RequestBody StreamEntry1670 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamEntry1670";
    }
}
