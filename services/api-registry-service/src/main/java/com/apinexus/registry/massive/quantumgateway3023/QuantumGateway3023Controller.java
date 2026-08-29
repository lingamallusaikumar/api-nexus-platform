package com.apinexus.registry.massive.quantumgateway3023;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/quantumgateway3023")
public class QuantumGateway3023Controller {
    private final QuantumGateway3023Service service;
    
    public QuantumGateway3023Controller(QuantumGateway3023Service service) { this.service = service; }
    
    @GetMapping
    public List<QuantumGateway3023> getAll() { return service.findAll(); }
    
    @PostMapping
    public QuantumGateway3023 create(@RequestBody QuantumGateway3023 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QuantumGateway3023";
    }
}
