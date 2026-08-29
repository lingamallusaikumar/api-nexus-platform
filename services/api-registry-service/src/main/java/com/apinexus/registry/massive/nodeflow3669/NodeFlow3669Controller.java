package com.apinexus.registry.massive.nodeflow3669;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodeflow3669")
public class NodeFlow3669Controller {
    private final NodeFlow3669Service service;
    
    public NodeFlow3669Controller(NodeFlow3669Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeFlow3669> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeFlow3669 create(@RequestBody NodeFlow3669 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeFlow3669";
    }
}
