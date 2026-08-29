package com.apinexus.registry.massive.clusteradapter3411;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clusteradapter3411")
public class ClusterAdapter3411Controller {
    private final ClusterAdapter3411Service service;
    
    public ClusterAdapter3411Controller(ClusterAdapter3411Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterAdapter3411> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterAdapter3411 create(@RequestBody ClusterAdapter3411 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterAdapter3411";
    }
}
