package com.apinexus.registry.massive.concreteworker8537;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/concreteworker8537")
public class ConcreteWorker8537Controller {
    private final ConcreteWorker8537Service service;
    
    public ConcreteWorker8537Controller(ConcreteWorker8537Service service) { this.service = service; }
    
    @GetMapping
    public List<ConcreteWorker8537> getAll() { return service.findAll(); }
    
    @PostMapping
    public ConcreteWorker8537 create(@RequestBody ConcreteWorker8537 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ConcreteWorker8537";
    }
}
