package com.apinexus.registry.massive.nodepool9737;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodepool9737")
public class NodePool9737Controller {
    private final NodePool9737Service service;
    
    public NodePool9737Controller(NodePool9737Service service) { this.service = service; }
    
    @GetMapping
    public List<NodePool9737> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodePool9737 create(@RequestBody NodePool9737 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodePool9737";
    }
}
