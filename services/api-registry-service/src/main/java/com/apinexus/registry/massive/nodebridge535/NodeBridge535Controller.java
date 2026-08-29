package com.apinexus.registry.massive.nodebridge535;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodebridge535")
public class NodeBridge535Controller {
    private final NodeBridge535Service service;
    
    public NodeBridge535Controller(NodeBridge535Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeBridge535> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeBridge535 create(@RequestBody NodeBridge535 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeBridge535";
    }
}
