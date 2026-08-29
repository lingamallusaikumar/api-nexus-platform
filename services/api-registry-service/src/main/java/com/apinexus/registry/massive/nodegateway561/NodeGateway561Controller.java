package com.apinexus.registry.massive.nodegateway561;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodegateway561")
public class NodeGateway561Controller {
    private final NodeGateway561Service service;
    
    public NodeGateway561Controller(NodeGateway561Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeGateway561> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeGateway561 create(@RequestBody NodeGateway561 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeGateway561";
    }
}
