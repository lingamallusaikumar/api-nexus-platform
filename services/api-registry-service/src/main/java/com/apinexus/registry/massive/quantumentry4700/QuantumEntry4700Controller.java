package com.apinexus.registry.massive.quantumentry4700;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/quantumentry4700")
public class QuantumEntry4700Controller {
    private final QuantumEntry4700Service service;
    
    public QuantumEntry4700Controller(QuantumEntry4700Service service) { this.service = service; }
    
    @GetMapping
    public List<QuantumEntry4700> getAll() { return service.findAll(); }
    
    @PostMapping
    public QuantumEntry4700 create(@RequestBody QuantumEntry4700 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QuantumEntry4700";
    }
}
