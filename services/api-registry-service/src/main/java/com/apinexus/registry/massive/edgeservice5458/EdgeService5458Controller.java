package com.apinexus.registry.massive.edgeservice5458;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgeservice5458")
public class EdgeService5458Controller {
    private final EdgeService5458Service service;
    
    public EdgeService5458Controller(EdgeService5458Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeService5458> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeService5458 create(@RequestBody EdgeService5458 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeService5458";
    }
}
