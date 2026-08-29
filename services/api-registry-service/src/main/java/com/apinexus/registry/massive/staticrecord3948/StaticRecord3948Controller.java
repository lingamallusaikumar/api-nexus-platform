package com.apinexus.registry.massive.staticrecord3948;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticrecord3948")
public class StaticRecord3948Controller {
    private final StaticRecord3948Service service;
    
    public StaticRecord3948Controller(StaticRecord3948Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticRecord3948> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticRecord3948 create(@RequestBody StaticRecord3948 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticRecord3948";
    }
}
