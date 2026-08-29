package com.apinexus.registry.massive.edgegraph5051;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgegraph5051")
public class EdgeGraph5051Controller {
    private final EdgeGraph5051Service service;
    
    public EdgeGraph5051Controller(EdgeGraph5051Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeGraph5051> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeGraph5051 create(@RequestBody EdgeGraph5051 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeGraph5051";
    }
}
