package com.apinexus.registry.massive.concretevertex6459;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/concretevertex6459")
public class ConcreteVertex6459Controller {
    private final ConcreteVertex6459Service service;
    
    public ConcreteVertex6459Controller(ConcreteVertex6459Service service) { this.service = service; }
    
    @GetMapping
    public List<ConcreteVertex6459> getAll() { return service.findAll(); }
    
    @PostMapping
    public ConcreteVertex6459 create(@RequestBody ConcreteVertex6459 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ConcreteVertex6459";
    }
}
