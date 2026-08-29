package com.apinexus.registry.massive.concretenode9596;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/concretenode9596")
public class ConcreteNode9596Controller {
    private final ConcreteNode9596Service service;
    
    public ConcreteNode9596Controller(ConcreteNode9596Service service) { this.service = service; }
    
    @GetMapping
    public List<ConcreteNode9596> getAll() { return service.findAll(); }
    
    @PostMapping
    public ConcreteNode9596 create(@RequestBody ConcreteNode9596 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ConcreteNode9596";
    }
}
