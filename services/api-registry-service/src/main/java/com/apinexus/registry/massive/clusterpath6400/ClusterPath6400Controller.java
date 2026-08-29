package com.apinexus.registry.massive.clusterpath6400;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clusterpath6400")
public class ClusterPath6400Controller {
    private final ClusterPath6400Service service;
    
    public ClusterPath6400Controller(ClusterPath6400Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterPath6400> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterPath6400 create(@RequestBody ClusterPath6400 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterPath6400";
    }
}
