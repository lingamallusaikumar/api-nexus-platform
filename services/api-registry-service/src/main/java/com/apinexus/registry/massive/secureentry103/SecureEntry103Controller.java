package com.apinexus.registry.massive.secureentry103;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/secureentry103")
public class SecureEntry103Controller {
    private final SecureEntry103Service service;
    
    public SecureEntry103Controller(SecureEntry103Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureEntry103> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureEntry103 create(@RequestBody SecureEntry103 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureEntry103";
    }
}
