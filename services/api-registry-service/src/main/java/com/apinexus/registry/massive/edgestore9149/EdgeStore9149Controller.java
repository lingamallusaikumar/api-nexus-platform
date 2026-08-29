package com.apinexus.registry.massive.edgestore9149;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgestore9149")
public class EdgeStore9149Controller {
    private final EdgeStore9149Service service;
    
    public EdgeStore9149Controller(EdgeStore9149Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeStore9149> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeStore9149 create(@RequestBody EdgeStore9149 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeStore9149";
    }
}
