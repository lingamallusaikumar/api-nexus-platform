package com.apinexus.registry.massive.quantummanager1844;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/quantummanager1844")
public class QuantumManager1844Controller {
    private final QuantumManager1844Service service;
    
    public QuantumManager1844Controller(QuantumManager1844Service service) { this.service = service; }
    
    @GetMapping
    public List<QuantumManager1844> getAll() { return service.findAll(); }
    
    @PostMapping
    public QuantumManager1844 create(@RequestBody QuantumManager1844 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QuantumManager1844";
    }
}
