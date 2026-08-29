package com.apinexus.registry.massive.streampool7616;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streampool7616")
public class StreamPool7616Controller {
    private final StreamPool7616Service service;
    
    public StreamPool7616Controller(StreamPool7616Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamPool7616> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamPool7616 create(@RequestBody StreamPool7616 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamPool7616";
    }
}
