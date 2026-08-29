package com.apinexus.registry.massive.staticadapter9637;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticadapter9637")
public class StaticAdapter9637Controller {
    private final StaticAdapter9637Service service;
    
    public StaticAdapter9637Controller(StaticAdapter9637Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticAdapter9637> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticAdapter9637 create(@RequestBody StaticAdapter9637 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticAdapter9637";
    }
}
