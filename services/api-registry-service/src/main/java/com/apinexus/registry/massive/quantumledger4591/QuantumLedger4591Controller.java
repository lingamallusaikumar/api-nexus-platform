package com.apinexus.registry.massive.quantumledger4591;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/quantumledger4591")
public class QuantumLedger4591Controller {
    private final QuantumLedger4591Service service;
    
    public QuantumLedger4591Controller(QuantumLedger4591Service service) { this.service = service; }
    
    @GetMapping
    public List<QuantumLedger4591> getAll() { return service.findAll(); }
    
    @PostMapping
    public QuantumLedger4591 create(@RequestBody QuantumLedger4591 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QuantumLedger4591";
    }
}
