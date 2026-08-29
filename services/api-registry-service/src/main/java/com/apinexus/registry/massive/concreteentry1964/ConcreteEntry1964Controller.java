package com.apinexus.registry.massive.concreteentry1964;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/concreteentry1964")
public class ConcreteEntry1964Controller {
    private final ConcreteEntry1964Service service;
    
    public ConcreteEntry1964Controller(ConcreteEntry1964Service service) { this.service = service; }
    
    @GetMapping
    public List<ConcreteEntry1964> getAll() { return service.findAll(); }
    
    @PostMapping
    public ConcreteEntry1964 create(@RequestBody ConcreteEntry1964 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ConcreteEntry1964";
    }
}
