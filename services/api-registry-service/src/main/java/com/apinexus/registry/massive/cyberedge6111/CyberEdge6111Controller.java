package com.apinexus.registry.massive.cyberedge6111;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cyberedge6111")
public class CyberEdge6111Controller {
    private final CyberEdge6111Service service;
    
    public CyberEdge6111Controller(CyberEdge6111Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberEdge6111> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberEdge6111 create(@RequestBody CyberEdge6111 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberEdge6111";
    }
}
