package com.apinexus.registry.massive.securescheduler8263;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/securescheduler8263")
public class SecureScheduler8263Controller {
    private final SecureScheduler8263Service service;
    
    public SecureScheduler8263Controller(SecureScheduler8263Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureScheduler8263> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureScheduler8263 create(@RequestBody SecureScheduler8263 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureScheduler8263";
    }
}
