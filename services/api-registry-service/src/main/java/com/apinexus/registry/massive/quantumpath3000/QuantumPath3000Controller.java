package com.apinexus.registry.massive.quantumpath3000;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/quantumpath3000")
public class QuantumPath3000Controller {
    private final QuantumPath3000Service service;
    
    public QuantumPath3000Controller(QuantumPath3000Service service) { this.service = service; }
    
    @GetMapping
    public List<QuantumPath3000> getAll() { return service.findAll(); }
    
    @PostMapping
    public QuantumPath3000 create(@RequestBody QuantumPath3000 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QuantumPath3000";
    }
}
