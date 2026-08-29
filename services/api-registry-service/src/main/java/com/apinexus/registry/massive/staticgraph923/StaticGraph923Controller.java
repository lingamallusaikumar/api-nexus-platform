package com.apinexus.registry.massive.staticgraph923;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticgraph923")
public class StaticGraph923Controller {
    private final StaticGraph923Service service;
    
    public StaticGraph923Controller(StaticGraph923Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticGraph923> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticGraph923 create(@RequestBody StaticGraph923 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticGraph923";
    }
}
