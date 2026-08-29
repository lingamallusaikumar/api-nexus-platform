package com.apinexus.registry.massive.streammanager9432;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streammanager9432")
public class StreamManager9432Controller {
    private final StreamManager9432Service service;
    
    public StreamManager9432Controller(StreamManager9432Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamManager9432> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamManager9432 create(@RequestBody StreamManager9432 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamManager9432";
    }
}
