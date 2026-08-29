package com.apinexus.registry.massive.secureitem7613;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/secureitem7613")
public class SecureItem7613Controller {
    private final SecureItem7613Service service;
    
    public SecureItem7613Controller(SecureItem7613Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureItem7613> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureItem7613 create(@RequestBody SecureItem7613 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureItem7613";
    }
}
