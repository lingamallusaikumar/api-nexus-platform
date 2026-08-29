package com.apinexus.registry.massive.clusterset2728;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clusterset2728")
public class ClusterSet2728Controller {
    private final ClusterSet2728Service service;
    
    public ClusterSet2728Controller(ClusterSet2728Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterSet2728> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterSet2728 create(@RequestBody ClusterSet2728 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterSet2728";
    }
}
