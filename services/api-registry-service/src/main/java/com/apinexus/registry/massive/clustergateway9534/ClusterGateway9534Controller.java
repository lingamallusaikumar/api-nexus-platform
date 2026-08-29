package com.apinexus.registry.massive.clustergateway9534;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clustergateway9534")
public class ClusterGateway9534Controller {
    private final ClusterGateway9534Service service;
    
    public ClusterGateway9534Controller(ClusterGateway9534Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterGateway9534> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterGateway9534 create(@RequestBody ClusterGateway9534 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterGateway9534";
    }
}
