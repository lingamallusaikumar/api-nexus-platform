package com.apinexus.registry.massive.quantummanager4514;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/quantummanager4514")
public class QuantumManager4514Controller {
    private final QuantumManager4514Service service;
    
    public QuantumManager4514Controller(QuantumManager4514Service service) { this.service = service; }
    
    @GetMapping
    public List<QuantumManager4514> getAll() { return service.findAll(); }
    
    @PostMapping
    public QuantumManager4514 create(@RequestBody QuantumManager4514 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QuantumManager4514";
    }
}
