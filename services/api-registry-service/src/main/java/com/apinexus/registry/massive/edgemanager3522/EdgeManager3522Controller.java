package com.apinexus.registry.massive.edgemanager3522;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgemanager3522")
public class EdgeManager3522Controller {
    private final EdgeManager3522Service service;
    
    public EdgeManager3522Controller(EdgeManager3522Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeManager3522> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeManager3522 create(@RequestBody EdgeManager3522 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeManager3522";
    }
}
