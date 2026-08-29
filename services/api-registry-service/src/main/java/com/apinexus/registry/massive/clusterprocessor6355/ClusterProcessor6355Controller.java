package com.apinexus.registry.massive.clusterprocessor6355;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clusterprocessor6355")
public class ClusterProcessor6355Controller {
    private final ClusterProcessor6355Service service;
    
    public ClusterProcessor6355Controller(ClusterProcessor6355Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterProcessor6355> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterProcessor6355 create(@RequestBody ClusterProcessor6355 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterProcessor6355";
    }
}
