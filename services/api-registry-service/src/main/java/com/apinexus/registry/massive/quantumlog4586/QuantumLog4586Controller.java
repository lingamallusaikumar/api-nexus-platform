package com.apinexus.registry.massive.quantumlog4586;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/quantumlog4586")
public class QuantumLog4586Controller {
    private final QuantumLog4586Service service;
    
    public QuantumLog4586Controller(QuantumLog4586Service service) { this.service = service; }
    
    @GetMapping
    public List<QuantumLog4586> getAll() { return service.findAll(); }
    
    @PostMapping
    public QuantumLog4586 create(@RequestBody QuantumLog4586 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QuantumLog4586";
    }
}
