package com.apinexus.registry.massive.concreteset5002;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/concreteset5002")
public class ConcreteSet5002Controller {
    private final ConcreteSet5002Service service;
    
    public ConcreteSet5002Controller(ConcreteSet5002Service service) { this.service = service; }
    
    @GetMapping
    public List<ConcreteSet5002> getAll() { return service.findAll(); }
    
    @PostMapping
    public ConcreteSet5002 create(@RequestBody ConcreteSet5002 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ConcreteSet5002";
    }
}
