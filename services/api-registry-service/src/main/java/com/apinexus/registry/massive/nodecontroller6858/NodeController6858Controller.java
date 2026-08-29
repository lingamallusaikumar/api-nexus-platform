package com.apinexus.registry.massive.nodecontroller6858;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodecontroller6858")
public class NodeController6858Controller {
    private final NodeController6858Service service;
    
    public NodeController6858Controller(NodeController6858Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeController6858> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeController6858 create(@RequestBody NodeController6858 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeController6858";
    }
}
