package com.apinexus.registry.massive.clusterlog2505;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/clusterlog2505")
public class ClusterLog2505Controller {
    private final ClusterLog2505Service service;
    
    public ClusterLog2505Controller(ClusterLog2505Service service) { this.service = service; }
    
    @GetMapping
    public List<ClusterLog2505> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClusterLog2505 create(@RequestBody ClusterLog2505 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClusterLog2505";
    }
}
