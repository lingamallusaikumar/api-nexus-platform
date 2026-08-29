package com.apinexus.registry.massive.nodeprocess8005;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodeprocess8005")
public class NodeProcess8005Controller {
    private final NodeProcess8005Service service;
    
    public NodeProcess8005Controller(NodeProcess8005Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeProcess8005> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeProcess8005 create(@RequestBody NodeProcess8005 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeProcess8005";
    }
}
