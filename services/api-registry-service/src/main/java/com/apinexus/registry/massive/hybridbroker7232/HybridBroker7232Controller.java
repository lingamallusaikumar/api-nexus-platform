package com.apinexus.registry.massive.hybridbroker7232;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hybridbroker7232")
public class HybridBroker7232Controller {
    private final HybridBroker7232Service service;
    
    public HybridBroker7232Controller(HybridBroker7232Service service) { this.service = service; }
    
    @GetMapping
    public List<HybridBroker7232> getAll() { return service.findAll(); }
    
    @PostMapping
    public HybridBroker7232 create(@RequestBody HybridBroker7232 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HybridBroker7232";
    }
}
