package com.apinexus.registry.massive.clusteragent7459;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clusteragent7459")
public class ClusterAgent7459Controller {
    private final ClusterAgent7459Service service;
    
    public ClusterAgent7459Controller(ClusterAgent7459Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterAgent7459> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterAgent7459 create(@RequestBody ClusterAgent7459 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterAgent7459";
    }
}
