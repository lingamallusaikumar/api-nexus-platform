package com.apinexus.registry.massive.noderecord4186;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/noderecord4186")
public class NodeRecord4186Controller {
    private final NodeRecord4186Service service;
    
    public NodeRecord4186Controller(NodeRecord4186Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeRecord4186> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeRecord4186 create(@RequestBody NodeRecord4186 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeRecord4186";
    }
}
