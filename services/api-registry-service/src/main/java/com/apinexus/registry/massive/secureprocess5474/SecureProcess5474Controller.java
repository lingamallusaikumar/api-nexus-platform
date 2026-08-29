package com.apinexus.registry.massive.secureprocess5474;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/secureprocess5474")
public class SecureProcess5474Controller {
    private final SecureProcess5474Service service;
    
    public SecureProcess5474Controller(SecureProcess5474Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureProcess5474> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureProcess5474 create(@RequestBody SecureProcess5474 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureProcess5474";
    }
}
