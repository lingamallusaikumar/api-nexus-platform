package com.apinexus.registry.massive.nodebuffer6840;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodebuffer6840")
public class NodeBuffer6840Controller {
    private final NodeBuffer6840Service service;
    
    public NodeBuffer6840Controller(NodeBuffer6840Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeBuffer6840> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeBuffer6840 create(@RequestBody NodeBuffer6840 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeBuffer6840";
    }
}
