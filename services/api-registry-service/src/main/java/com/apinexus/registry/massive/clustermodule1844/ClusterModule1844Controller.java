package com.apinexus.registry.massive.clustermodule1844;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clustermodule1844")
public class ClusterModule1844Controller {
    private final ClusterModule1844Service service;
    
    public ClusterModule1844Controller(ClusterModule1844Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterModule1844> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterModule1844 create(@RequestBody ClusterModule1844 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterModule1844";
    }
}
