package com.apinexus.registry.massive.clusterrepo4858;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clusterrepo4858")
public class ClusterRepo4858Controller {
    private final ClusterRepo4858Service service;
    
    public ClusterRepo4858Controller(ClusterRepo4858Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterRepo4858> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterRepo4858 create(@RequestBody ClusterRepo4858 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterRepo4858";
    }
}
