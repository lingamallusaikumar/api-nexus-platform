package com.apinexus.registry.massive.concreteflow9528;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/concreteflow9528")
public class ConcreteFlow9528Controller {
    private final ConcreteFlow9528Service service;
    
    public ConcreteFlow9528Controller(ConcreteFlow9528Service service) { this.service = service; }
    
    @GetMapping
    public List<ConcreteFlow9528> getAll() { return service.findAll(); }
    
    @PostMapping
    public ConcreteFlow9528 create(@RequestBody ConcreteFlow9528 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ConcreteFlow9528";
    }
}
