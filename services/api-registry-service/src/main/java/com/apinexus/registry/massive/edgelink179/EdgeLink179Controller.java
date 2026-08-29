package com.apinexus.registry.massive.edgelink179;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgelink179")
public class EdgeLink179Controller {
    private final EdgeLink179Service service;
    
    public EdgeLink179Controller(EdgeLink179Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeLink179> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeLink179 create(@RequestBody EdgeLink179 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeLink179";
    }
}
