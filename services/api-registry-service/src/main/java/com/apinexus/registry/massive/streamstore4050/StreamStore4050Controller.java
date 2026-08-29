package com.apinexus.registry.massive.streamstore4050;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streamstore4050")
public class StreamStore4050Controller {
    private final StreamStore4050Service service;
    
    public StreamStore4050Controller(StreamStore4050Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamStore4050> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamStore4050 create(@RequestBody StreamStore4050 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamStore4050";
    }
}
