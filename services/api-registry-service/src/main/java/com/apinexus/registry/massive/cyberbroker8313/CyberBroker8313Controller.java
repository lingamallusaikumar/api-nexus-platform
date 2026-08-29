package com.apinexus.registry.massive.cyberbroker8313;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cyberbroker8313")
public class CyberBroker8313Controller {
    private final CyberBroker8313Service service;
    
    public CyberBroker8313Controller(CyberBroker8313Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberBroker8313> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberBroker8313 create(@RequestBody CyberBroker8313 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberBroker8313";
    }
}
