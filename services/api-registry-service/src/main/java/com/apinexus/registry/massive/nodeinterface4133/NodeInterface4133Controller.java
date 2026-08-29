package com.apinexus.registry.massive.nodeinterface4133;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodeinterface4133")
public class NodeInterface4133Controller {
    private final NodeInterface4133Service service;
    
    public NodeInterface4133Controller(NodeInterface4133Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeInterface4133> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeInterface4133 create(@RequestBody NodeInterface4133 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeInterface4133";
    }
}
