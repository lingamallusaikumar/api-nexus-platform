package com.apinexus.registry.massive.nodeengine5686;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodeengine5686")
public class NodeEngine5686Controller {
    private final NodeEngine5686Service service;
    
    public NodeEngine5686Controller(NodeEngine5686Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeEngine5686> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeEngine5686 create(@RequestBody NodeEngine5686 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeEngine5686";
    }
}
