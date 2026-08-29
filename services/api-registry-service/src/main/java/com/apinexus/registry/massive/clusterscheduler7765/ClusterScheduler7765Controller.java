package com.apinexus.registry.massive.clusterscheduler7765;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clusterscheduler7765")
public class ClusterScheduler7765Controller {
    private final ClusterScheduler7765Service service;
    
    public ClusterScheduler7765Controller(ClusterScheduler7765Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterScheduler7765> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterScheduler7765 create(@RequestBody ClusterScheduler7765 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterScheduler7765";
    }
}
