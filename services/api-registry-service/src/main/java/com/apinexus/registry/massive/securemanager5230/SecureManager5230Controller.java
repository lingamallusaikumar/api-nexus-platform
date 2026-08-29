package com.apinexus.registry.massive.securemanager5230;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/securemanager5230")
public class SecureManager5230Controller {
    private final SecureManager5230Service service;
    
    public SecureManager5230Controller(SecureManager5230Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureManager5230> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureManager5230 create(@RequestBody SecureManager5230 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureManager5230";
    }
}
