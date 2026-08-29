package com.apinexus.registry.massive.edgemanager51;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgemanager51")
public class EdgeManager51Controller {
    private final EdgeManager51Service service;
    
    public EdgeManager51Controller(EdgeManager51Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeManager51> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeManager51 create(@RequestBody EdgeManager51 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeManager51";
    }
}
