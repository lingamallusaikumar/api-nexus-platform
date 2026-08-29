package com.apinexus.registry.massive.nodestore6622;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodestore6622")
public class NodeStore6622Controller {
    private final NodeStore6622Service service;
    
    public NodeStore6622Controller(NodeStore6622Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeStore6622> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeStore6622 create(@RequestBody NodeStore6622 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeStore6622";
    }
}
