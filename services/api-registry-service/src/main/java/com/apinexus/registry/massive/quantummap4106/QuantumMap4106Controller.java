package com.apinexus.registry.massive.quantummap4106;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/quantummap4106")
public class QuantumMap4106Controller {
    private final QuantumMap4106Service service;
    
    public QuantumMap4106Controller(QuantumMap4106Service service) { this.service = service; }
    
    @GetMapping
    public List<QuantumMap4106> getAll() { return service.findAll(); }
    
    @PostMapping
    public QuantumMap4106 create(@RequestBody QuantumMap4106 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QuantumMap4106";
    }
}
