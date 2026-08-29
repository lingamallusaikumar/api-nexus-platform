package com.apinexus.registry.massive.concretequeue4473;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/concretequeue4473")
public class ConcreteQueue4473Controller {
    private final ConcreteQueue4473Service service;
    
    public ConcreteQueue4473Controller(ConcreteQueue4473Service service) { this.service = service; }
    
    @GetMapping
    public List<ConcreteQueue4473> getAll() { return service.findAll(); }
    
    @PostMapping
    public ConcreteQueue4473 create(@RequestBody ConcreteQueue4473 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ConcreteQueue4473";
    }
}
