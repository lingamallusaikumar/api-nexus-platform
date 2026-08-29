package com.apinexus.registry.massive.securehandler1469;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/securehandler1469")
public class SecureHandler1469Controller {
    private final SecureHandler1469Service service;
    
    public SecureHandler1469Controller(SecureHandler1469Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureHandler1469> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureHandler1469 create(@RequestBody SecureHandler1469 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureHandler1469";
    }
}
