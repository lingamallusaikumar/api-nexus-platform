package com.apinexus.registry.massive.clusteredge6699;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clusteredge6699")
public class ClusterEdge6699Controller {
    private final ClusterEdge6699Service service;
    
    public ClusterEdge6699Controller(ClusterEdge6699Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterEdge6699> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterEdge6699 create(@RequestBody ClusterEdge6699 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterEdge6699";
    }
}
