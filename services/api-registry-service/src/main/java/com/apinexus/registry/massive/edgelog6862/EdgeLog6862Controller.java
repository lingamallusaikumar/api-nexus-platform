package com.apinexus.registry.massive.edgelog6862;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgelog6862")
public class EdgeLog6862Controller {
    private final EdgeLog6862Service service;
    
    public EdgeLog6862Controller(EdgeLog6862Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeLog6862> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeLog6862 create(@RequestBody EdgeLog6862 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeLog6862";
    }
}
