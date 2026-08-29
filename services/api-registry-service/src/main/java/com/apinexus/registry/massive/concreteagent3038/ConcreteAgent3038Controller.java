package com.apinexus.registry.massive.concreteagent3038;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/concreteagent3038")
public class ConcreteAgent3038Controller {
    private final ConcreteAgent3038Service service;
    
    public ConcreteAgent3038Controller(ConcreteAgent3038Service service) { this.service = service; }
    
    @GetMapping
    public List<ConcreteAgent3038> getAll() { return service.findAll(); }
    
    @PostMapping
    public ConcreteAgent3038 create(@RequestBody ConcreteAgent3038 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ConcreteAgent3038";
    }
}
