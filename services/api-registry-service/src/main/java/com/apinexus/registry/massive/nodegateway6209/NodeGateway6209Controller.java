package com.apinexus.registry.massive.nodegateway6209;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodegateway6209")
public class NodeGateway6209Controller {
    private final NodeGateway6209Service service;
    
    public NodeGateway6209Controller(NodeGateway6209Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeGateway6209> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeGateway6209 create(@RequestBody NodeGateway6209 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeGateway6209";
    }
}
