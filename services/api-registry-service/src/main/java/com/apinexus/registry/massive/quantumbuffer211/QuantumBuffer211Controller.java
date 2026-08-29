package com.apinexus.registry.massive.quantumbuffer211;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/quantumbuffer211")
public class QuantumBuffer211Controller {
    private final QuantumBuffer211Service service;
    
    public QuantumBuffer211Controller(QuantumBuffer211Service service) { this.service = service; }
    
    @GetMapping
    public List<QuantumBuffer211> getAll() { return service.findAll(); }
    
    @PostMapping
    public QuantumBuffer211 create(@RequestBody QuantumBuffer211 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QuantumBuffer211";
    }
}
