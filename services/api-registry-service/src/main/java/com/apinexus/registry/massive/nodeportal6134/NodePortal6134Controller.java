package com.apinexus.registry.massive.nodeportal6134;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodeportal6134")
public class NodePortal6134Controller {
    private final NodePortal6134Service service;
    
    public NodePortal6134Controller(NodePortal6134Service service) { this.service = service; }
    
    @GetMapping
    public List<NodePortal6134> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodePortal6134 create(@RequestBody NodePortal6134 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodePortal6134";
    }
}
