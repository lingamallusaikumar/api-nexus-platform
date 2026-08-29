package com.apinexus.registry.massive.securequeue506;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/securequeue506")
public class SecureQueue506Controller {
    private final SecureQueue506Service service;
    
    public SecureQueue506Controller(SecureQueue506Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureQueue506> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureQueue506 create(@RequestBody SecureQueue506 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureQueue506";
    }
}
