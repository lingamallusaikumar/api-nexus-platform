package com.apinexus.registry.massive.quantumworker2432;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/quantumworker2432")
public class QuantumWorker2432Controller {
    private final QuantumWorker2432Service service;
    
    public QuantumWorker2432Controller(QuantumWorker2432Service service) { this.service = service; }
    
    @GetMapping
    public List<QuantumWorker2432> getAll() { return service.findAll(); }
    
    @PostMapping
    public QuantumWorker2432 create(@RequestBody QuantumWorker2432 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QuantumWorker2432";
    }
}
