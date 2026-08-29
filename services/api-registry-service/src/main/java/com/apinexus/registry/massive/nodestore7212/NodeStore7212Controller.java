package com.apinexus.registry.massive.nodestore7212;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodestore7212")
public class NodeStore7212Controller {
    private final NodeStore7212Service service;
    
    public NodeStore7212Controller(NodeStore7212Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeStore7212> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeStore7212 create(@RequestBody NodeStore7212 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeStore7212";
    }
}
