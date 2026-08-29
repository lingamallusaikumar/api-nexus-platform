package com.apinexus.registry.massive.streamthread1436;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streamthread1436")
public class StreamThread1436Controller {
    private final StreamThread1436Service service;
    
    public StreamThread1436Controller(StreamThread1436Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamThread1436> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamThread1436 create(@RequestBody StreamThread1436 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamThread1436";
    }
}
