package com.apinexus.registry.massive.securetask4915;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/securetask4915")
public class SecureTask4915Controller {
    private final SecureTask4915Service service;
    
    public SecureTask4915Controller(SecureTask4915Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureTask4915> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureTask4915 create(@RequestBody SecureTask4915 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureTask4915";
    }
}
