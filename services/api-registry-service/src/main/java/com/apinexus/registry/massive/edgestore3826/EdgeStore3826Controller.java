package com.apinexus.registry.massive.edgestore3826;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgestore3826")
public class EdgeStore3826Controller {
    private final EdgeStore3826Service service;
    
    public EdgeStore3826Controller(EdgeStore3826Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeStore3826> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeStore3826 create(@RequestBody EdgeStore3826 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeStore3826";
    }
}
