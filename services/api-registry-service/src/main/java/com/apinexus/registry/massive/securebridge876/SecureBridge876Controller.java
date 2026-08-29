package com.apinexus.registry.massive.securebridge876;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/securebridge876")
public class SecureBridge876Controller {
    private final SecureBridge876Service service;
    
    public SecureBridge876Controller(SecureBridge876Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureBridge876> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureBridge876 create(@RequestBody SecureBridge876 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureBridge876";
    }
}
