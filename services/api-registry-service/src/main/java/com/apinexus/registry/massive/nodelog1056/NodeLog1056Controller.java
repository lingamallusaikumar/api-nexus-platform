package com.apinexus.registry.massive.nodelog1056;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodelog1056")
public class NodeLog1056Controller {
    private final NodeLog1056Service service;
    
    public NodeLog1056Controller(NodeLog1056Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeLog1056> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeLog1056 create(@RequestBody NodeLog1056 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeLog1056";
    }
}
