package com.apinexus.registry.massive.secureprocess8850;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/secureprocess8850")
public class SecureProcess8850Controller {
    private final SecureProcess8850Service service;
    
    public SecureProcess8850Controller(SecureProcess8850Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureProcess8850> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureProcess8850 create(@RequestBody SecureProcess8850 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureProcess8850";
    }
}
