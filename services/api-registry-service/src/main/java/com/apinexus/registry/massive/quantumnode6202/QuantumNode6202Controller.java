package com.apinexus.registry.massive.quantumnode6202;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/quantumnode6202")
public class QuantumNode6202Controller {
    private final QuantumNode6202Service service;
    
    public QuantumNode6202Controller(QuantumNode6202Service service) { this.service = service; }
    
    @GetMapping
    public List<QuantumNode6202> getAll() { return service.findAll(); }
    
    @PostMapping
    public QuantumNode6202 create(@RequestBody QuantumNode6202 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QuantumNode6202";
    }
}
