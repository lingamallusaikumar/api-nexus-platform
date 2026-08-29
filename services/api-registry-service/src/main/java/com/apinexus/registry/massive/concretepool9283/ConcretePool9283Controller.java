package com.apinexus.registry.massive.concretepool9283;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/concretepool9283")
public class ConcretePool9283Controller {
    private final ConcretePool9283Service service;
    
    public ConcretePool9283Controller(ConcretePool9283Service service) { this.service = service; }
    
    @GetMapping
    public List<ConcretePool9283> getAll() { return service.findAll(); }
    
    @PostMapping
    public ConcretePool9283 create(@RequestBody ConcretePool9283 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ConcretePool9283";
    }
}
