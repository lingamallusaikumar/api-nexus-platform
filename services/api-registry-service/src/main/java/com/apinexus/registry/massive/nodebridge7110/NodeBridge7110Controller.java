package com.apinexus.registry.massive.nodebridge7110;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodebridge7110")
public class NodeBridge7110Controller {
    private final NodeBridge7110Service service;
    
    public NodeBridge7110Controller(NodeBridge7110Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeBridge7110> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeBridge7110 create(@RequestBody NodeBridge7110 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeBridge7110";
    }
}
