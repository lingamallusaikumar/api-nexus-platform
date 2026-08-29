package com.apinexus.registry.massive.concretebridge7537;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/concretebridge7537")
public class ConcreteBridge7537Controller {
    private final ConcreteBridge7537Service service;
    
    public ConcreteBridge7537Controller(ConcreteBridge7537Service service) { this.service = service; }
    
    @GetMapping
    public List<ConcreteBridge7537> getAll() { return service.findAll(); }
    
    @PostMapping
    public ConcreteBridge7537 create(@RequestBody ConcreteBridge7537 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ConcreteBridge7537";
    }
}
