package com.apinexus.registry.massive.securebroker8898;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/securebroker8898")
public class SecureBroker8898Controller {
    private final SecureBroker8898Service service;
    
    public SecureBroker8898Controller(SecureBroker8898Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureBroker8898> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureBroker8898 create(@RequestBody SecureBroker8898 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureBroker8898";
    }
}
