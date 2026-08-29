package com.apinexus.registry.massive.clusterqueue7224;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clusterqueue7224")
public class ClusterQueue7224Controller {
    private final ClusterQueue7224Service service;
    
    public ClusterQueue7224Controller(ClusterQueue7224Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterQueue7224> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterQueue7224 create(@RequestBody ClusterQueue7224 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterQueue7224";
    }
}
