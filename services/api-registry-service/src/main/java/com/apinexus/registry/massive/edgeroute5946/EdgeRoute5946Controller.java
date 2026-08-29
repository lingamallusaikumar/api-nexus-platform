package com.apinexus.registry.massive.edgeroute5946;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgeroute5946")
public class EdgeRoute5946Controller {
    private final EdgeRoute5946Service service;
    
    public EdgeRoute5946Controller(EdgeRoute5946Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeRoute5946> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeRoute5946 create(@RequestBody EdgeRoute5946 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeRoute5946";
    }
}
