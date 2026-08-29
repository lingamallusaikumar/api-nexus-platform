package com.apinexus.registry.massive.edgedatabase1823;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgedatabase1823")
public class EdgeDatabase1823Controller {
    private final EdgeDatabase1823Service service;
    
    public EdgeDatabase1823Controller(EdgeDatabase1823Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeDatabase1823> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeDatabase1823 create(@RequestBody EdgeDatabase1823 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeDatabase1823";
    }
}
