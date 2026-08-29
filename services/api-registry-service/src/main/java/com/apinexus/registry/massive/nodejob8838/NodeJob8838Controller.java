package com.apinexus.registry.massive.nodejob8838;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodejob8838")
public class NodeJob8838Controller {
    private final NodeJob8838Service service;
    
    public NodeJob8838Controller(NodeJob8838Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeJob8838> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeJob8838 create(@RequestBody NodeJob8838 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeJob8838";
    }
}
