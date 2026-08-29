package com.apinexus.registry.massive.clustermap8443;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clustermap8443")
public class ClusterMap8443Controller {
    private final ClusterMap8443Service service;
    
    public ClusterMap8443Controller(ClusterMap8443Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterMap8443> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterMap8443 create(@RequestBody ClusterMap8443 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterMap8443";
    }
}
