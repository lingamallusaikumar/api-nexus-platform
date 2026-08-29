package com.apinexus.registry.massive.clusterbroker8562;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clusterbroker8562")
public class ClusterBroker8562Controller {
    private final ClusterBroker8562Service service;
    
    public ClusterBroker8562Controller(ClusterBroker8562Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterBroker8562> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterBroker8562 create(@RequestBody ClusterBroker8562 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterBroker8562";
    }
}
