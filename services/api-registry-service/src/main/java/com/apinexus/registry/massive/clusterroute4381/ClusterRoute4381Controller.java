package com.apinexus.registry.massive.clusterroute4381;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clusterroute4381")
public class ClusterRoute4381Controller {
    private final ClusterRoute4381Service service;
    
    public ClusterRoute4381Controller(ClusterRoute4381Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterRoute4381> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterRoute4381 create(@RequestBody ClusterRoute4381 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterRoute4381";
    }
}
