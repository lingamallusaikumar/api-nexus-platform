package com.apinexus.registry.massive.securescheduler4669;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/securescheduler4669")
public class SecureScheduler4669Controller {
    private final SecureScheduler4669Service service;
    
    public SecureScheduler4669Controller(SecureScheduler4669Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureScheduler4669> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureScheduler4669 create(@RequestBody SecureScheduler4669 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureScheduler4669";
    }
}
