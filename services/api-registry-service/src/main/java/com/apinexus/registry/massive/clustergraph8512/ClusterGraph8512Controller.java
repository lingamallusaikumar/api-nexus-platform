package com.apinexus.registry.massive.clustergraph8512;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clustergraph8512")
public class ClusterGraph8512Controller {
    private final ClusterGraph8512Service service;
    
    public ClusterGraph8512Controller(ClusterGraph8512Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterGraph8512> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterGraph8512 create(@RequestBody ClusterGraph8512 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterGraph8512";
    }
}
