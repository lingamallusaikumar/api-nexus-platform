package com.apinexus.registry.massive.nodelink4175;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodelink4175")
public class NodeLink4175Controller {
    private final NodeLink4175Service service;
    
    public NodeLink4175Controller(NodeLink4175Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeLink4175> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeLink4175 create(@RequestBody NodeLink4175 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeLink4175";
    }
}
