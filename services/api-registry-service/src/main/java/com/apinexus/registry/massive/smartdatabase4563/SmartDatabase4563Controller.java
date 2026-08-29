package com.apinexus.registry.massive.smartdatabase4563;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/smartdatabase4563")
public class SmartDatabase4563Controller {
    private final SmartDatabase4563Service service;
    
    public SmartDatabase4563Controller(SmartDatabase4563Service service) { this.service = service; }
    
    @GetMapping
    public List<SmartDatabase4563> getAll() { return service.findAll(); }
    
    @PostMapping
    public SmartDatabase4563 create(@RequestBody SmartDatabase4563 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SmartDatabase4563";
    }
}
