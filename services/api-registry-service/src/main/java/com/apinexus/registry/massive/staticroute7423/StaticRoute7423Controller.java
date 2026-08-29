package com.apinexus.registry.massive.staticroute7423;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticroute7423")
public class StaticRoute7423Controller {
    private final StaticRoute7423Service service;
    
    public StaticRoute7423Controller(StaticRoute7423Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticRoute7423> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticRoute7423 create(@RequestBody StaticRoute7423 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticRoute7423";
    }
}
