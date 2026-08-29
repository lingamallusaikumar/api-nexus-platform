package com.apinexus.registry.massive.clusterengine4963;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clusterengine4963")
public class ClusterEngine4963Controller {
    private final ClusterEngine4963Service service;
    
    public ClusterEngine4963Controller(ClusterEngine4963Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterEngine4963> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterEngine4963 create(@RequestBody ClusterEngine4963 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterEngine4963";
    }
}
