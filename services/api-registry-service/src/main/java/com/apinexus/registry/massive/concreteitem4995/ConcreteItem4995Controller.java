package com.apinexus.registry.massive.concreteitem4995;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/concreteitem4995")
public class ConcreteItem4995Controller {
    private final ConcreteItem4995Service service;
    
    public ConcreteItem4995Controller(ConcreteItem4995Service service) { this.service = service; }
    
    @GetMapping
    public List<ConcreteItem4995> getAll() { return service.findAll(); }
    
    @PostMapping
    public ConcreteItem4995 create(@RequestBody ConcreteItem4995 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ConcreteItem4995";
    }
}
