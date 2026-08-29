package com.apinexus.registry.massive.quantumentry9190;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/quantumentry9190")
public class QuantumEntry9190Controller {
    private final QuantumEntry9190Service service;
    
    public QuantumEntry9190Controller(QuantumEntry9190Service service) { this.service = service; }
    
    @GetMapping
    public List<QuantumEntry9190> getAll() { return service.findAll(); }
    
    @PostMapping
    public QuantumEntry9190 create(@RequestBody QuantumEntry9190 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QuantumEntry9190";
    }
}
