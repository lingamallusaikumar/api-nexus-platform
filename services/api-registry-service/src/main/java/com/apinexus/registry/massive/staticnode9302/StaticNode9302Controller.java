package com.apinexus.registry.massive.staticnode9302;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticnode9302")
public class StaticNode9302Controller {
    private final StaticNode9302Service service;
    
    public StaticNode9302Controller(StaticNode9302Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticNode9302> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticNode9302 create(@RequestBody StaticNode9302 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticNode9302";
    }
}
