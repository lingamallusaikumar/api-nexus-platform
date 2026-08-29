package com.apinexus.registry.massive.edgerecord9915;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgerecord9915")
public class EdgeRecord9915Controller {
    private final EdgeRecord9915Service service;
    
    public EdgeRecord9915Controller(EdgeRecord9915Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeRecord9915> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeRecord9915 create(@RequestBody EdgeRecord9915 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeRecord9915";
    }
}
