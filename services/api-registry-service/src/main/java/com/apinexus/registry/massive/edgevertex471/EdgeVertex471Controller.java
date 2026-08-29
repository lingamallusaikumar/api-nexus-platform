package com.apinexus.registry.massive.edgevertex471;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgevertex471")
public class EdgeVertex471Controller {
    private final EdgeVertex471Service service;
    
    public EdgeVertex471Controller(EdgeVertex471Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeVertex471> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeVertex471 create(@RequestBody EdgeVertex471 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeVertex471";
    }
}
