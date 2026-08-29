package com.apinexus.registry.massive.edgeedge5920;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgeedge5920")
public class EdgeEdge5920Controller {
    private final EdgeEdge5920Service service;
    
    public EdgeEdge5920Controller(EdgeEdge5920Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeEdge5920> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeEdge5920 create(@RequestBody EdgeEdge5920 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeEdge5920";
    }
}
