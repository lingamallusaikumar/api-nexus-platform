package com.apinexus.registry.massive.securescheduler1093;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/securescheduler1093")
public class SecureScheduler1093Controller {
    private final SecureScheduler1093Service service;
    
    public SecureScheduler1093Controller(SecureScheduler1093Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureScheduler1093> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureScheduler1093 create(@RequestBody SecureScheduler1093 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureScheduler1093";
    }
}
