package com.apinexus.registry.massive.nodelink3029;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodelink3029")
public class NodeLink3029Controller {
    private final NodeLink3029Service service;
    
    public NodeLink3029Controller(NodeLink3029Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeLink3029> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeLink3029 create(@RequestBody NodeLink3029 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeLink3029";
    }
}
