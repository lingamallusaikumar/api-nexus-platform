package com.apinexus.registry.massive.clusterledger3405;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clusterledger3405")
public class ClusterLedger3405Controller {
    private final ClusterLedger3405Service service;
    
    public ClusterLedger3405Controller(ClusterLedger3405Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterLedger3405> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterLedger3405 create(@RequestBody ClusterLedger3405 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterLedger3405";
    }
}
