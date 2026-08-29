package com.apinexus.registry.massive.switchbroker2974;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/switchbroker2974")
public class SwitchBroker2974Controller {
    private final SwitchBroker2974Service service;
    
    public SwitchBroker2974Controller(SwitchBroker2974Service service) { this.service = service; }
    
    @GetMapping
    public List<SwitchBroker2974> getAll() { return service.findAll(); }
    
    @PostMapping
    public SwitchBroker2974 create(@RequestBody SwitchBroker2974 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SwitchBroker2974";
    }
}
