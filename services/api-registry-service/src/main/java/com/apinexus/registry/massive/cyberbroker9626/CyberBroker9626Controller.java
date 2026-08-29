package com.apinexus.registry.massive.cyberbroker9626;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cyberbroker9626")
public class CyberBroker9626Controller {
    private final CyberBroker9626Service service;
    
    public CyberBroker9626Controller(CyberBroker9626Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberBroker9626> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberBroker9626 create(@RequestBody CyberBroker9626 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberBroker9626";
    }
}
