package com.apinexus.registry.massive.nodeedge4433;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodeedge4433")
public class NodeEdge4433Controller {
    private final NodeEdge4433Service service;
    
    public NodeEdge4433Controller(NodeEdge4433Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeEdge4433> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeEdge4433 create(@RequestBody NodeEdge4433 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeEdge4433";
    }
}
