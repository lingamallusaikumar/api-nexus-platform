package com.apinexus.registry.massive.nodetree4320;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/nodetree4320")
public class NodeTree4320Controller {
    private final NodeTree4320Service service;
    
    public NodeTree4320Controller(NodeTree4320Service service) { this.service = service; }
    
    @GetMapping
    public List<NodeTree4320> getAll() { return service.findAll(); }
    
    @PostMapping
    public NodeTree4320 create(@RequestBody NodeTree4320 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NodeTree4320";
    }
}
