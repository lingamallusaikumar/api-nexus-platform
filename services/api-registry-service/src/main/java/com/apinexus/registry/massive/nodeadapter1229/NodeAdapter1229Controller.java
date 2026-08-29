package com.apinexus.registry.massive.nodeadapter1229;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodeadapter1229")
public class NodeAdapter1229Controller {
    private final NodeAdapter1229Service service;
    
    public NodeAdapter1229Controller(NodeAdapter1229Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeAdapter1229> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeAdapter1229 create(@RequestBody NodeAdapter1229 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeAdapter1229";
    }
}
