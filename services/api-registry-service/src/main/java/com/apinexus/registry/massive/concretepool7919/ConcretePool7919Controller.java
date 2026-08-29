package com.apinexus.registry.massive.concretepool7919;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/concretepool7919")
public class ConcretePool7919Controller {
    private final ConcretePool7919Service service;
    
    public ConcretePool7919Controller(ConcretePool7919Service service) { this.service = service; }
    
    @GetMapping
    public List<ConcretePool7919> getAll() { return service.findAll(); }
    
    @PostMapping
    public ConcretePool7919 create(@RequestBody ConcretePool7919 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ConcretePool7919";
    }
}
