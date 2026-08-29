package com.apinexus.registry.massive.nodecontroller6820;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodecontroller6820")
public class NodeController6820Controller {
    private final NodeController6820Service service;
    
    public NodeController6820Controller(NodeController6820Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeController6820> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeController6820 create(@RequestBody NodeController6820 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeController6820";
    }
}
