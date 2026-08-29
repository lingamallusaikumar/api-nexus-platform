package com.apinexus.registry.massive.nodeprocessor4766;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodeprocessor4766")
public class NodeProcessor4766Controller {
    private final NodeProcessor4766Service service;
    
    public NodeProcessor4766Controller(NodeProcessor4766Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeProcessor4766> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeProcessor4766 create(@RequestBody NodeProcessor4766 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeProcessor4766";
    }
}
