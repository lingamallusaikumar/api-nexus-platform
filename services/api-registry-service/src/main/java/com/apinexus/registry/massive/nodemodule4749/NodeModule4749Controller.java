package com.apinexus.registry.massive.nodemodule4749;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodemodule4749")
public class NodeModule4749Controller {
    private final NodeModule4749Service service;
    
    public NodeModule4749Controller(NodeModule4749Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeModule4749> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeModule4749 create(@RequestBody NodeModule4749 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeModule4749";
    }
}
