package com.apinexus.registry.massive.clusterengine187;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clusterengine187")
public class ClusterEngine187Controller {
    private final ClusterEngine187Service service;
    
    public ClusterEngine187Controller(ClusterEngine187Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterEngine187> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterEngine187 create(@RequestBody ClusterEngine187 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterEngine187";
    }
}
