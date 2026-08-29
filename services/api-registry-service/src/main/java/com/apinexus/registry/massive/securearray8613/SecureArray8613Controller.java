package com.apinexus.registry.massive.securearray8613;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/securearray8613")
public class SecureArray8613Controller {
    private final SecureArray8613Service service;
    
    public SecureArray8613Controller(SecureArray8613Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureArray8613> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureArray8613 create(@RequestBody SecureArray8613 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureArray8613";
    }
}
