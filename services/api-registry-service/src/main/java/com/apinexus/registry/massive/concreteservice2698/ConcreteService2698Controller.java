package com.apinexus.registry.massive.concreteservice2698;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/concreteservice2698")
public class ConcreteService2698Controller {
    private final ConcreteService2698Service service;
    
    public ConcreteService2698Controller(ConcreteService2698Service service) { this.service = service; }
    
    @GetMapping
    public List<ConcreteService2698> getAll() { return service.findAll(); }
    
    @PostMapping
    public ConcreteService2698 create(@RequestBody ConcreteService2698 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ConcreteService2698";
    }
}
