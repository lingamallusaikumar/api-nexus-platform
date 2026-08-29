package com.apinexus.registry.massive.staticprocessor1109;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticprocessor1109")
public class StaticProcessor1109Controller {
    private final StaticProcessor1109Service service;
    
    public StaticProcessor1109Controller(StaticProcessor1109Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticProcessor1109> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticProcessor1109 create(@RequestBody StaticProcessor1109 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticProcessor1109";
    }
}
