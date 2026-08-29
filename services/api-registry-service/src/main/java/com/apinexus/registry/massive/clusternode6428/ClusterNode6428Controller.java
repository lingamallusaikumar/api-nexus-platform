package com.apinexus.registry.massive.clusternode6428;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clusternode6428")
public class ClusterNode6428Controller {
    private final ClusterNode6428Service service;
    
    public ClusterNode6428Controller(ClusterNode6428Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterNode6428> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterNode6428 create(@RequestBody ClusterNode6428 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterNode6428";
    }
}
