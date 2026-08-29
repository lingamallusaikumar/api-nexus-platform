package com.apinexus.registry.massive.nodebuffer6679;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodebuffer6679")
public class NodeBuffer6679Controller {
    private final NodeBuffer6679Service service;
    
    public NodeBuffer6679Controller(NodeBuffer6679Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeBuffer6679> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeBuffer6679 create(@RequestBody NodeBuffer6679 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeBuffer6679";
    }
}
