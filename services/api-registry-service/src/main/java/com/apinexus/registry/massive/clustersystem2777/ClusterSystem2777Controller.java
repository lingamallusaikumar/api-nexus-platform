package com.apinexus.registry.massive.clustersystem2777;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clustersystem2777")
public class ClusterSystem2777Controller {
    private final ClusterSystem2777Service service;
    
    public ClusterSystem2777Controller(ClusterSystem2777Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterSystem2777> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterSystem2777 create(@RequestBody ClusterSystem2777 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterSystem2777";
    }
}
