package com.apinexus.registry.massive.clusterroute4040;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clusterroute4040")
public class ClusterRoute4040Controller {
    private final ClusterRoute4040Service service;
    
    public ClusterRoute4040Controller(ClusterRoute4040Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterRoute4040> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterRoute4040 create(@RequestBody ClusterRoute4040 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterRoute4040";
    }
}
