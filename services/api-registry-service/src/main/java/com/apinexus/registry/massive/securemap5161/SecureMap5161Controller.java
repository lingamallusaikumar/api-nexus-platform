package com.apinexus.registry.massive.securemap5161;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/securemap5161")
public class SecureMap5161Controller {
    private final SecureMap5161Service service;
    
    public SecureMap5161Controller(SecureMap5161Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureMap5161> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureMap5161 create(@RequestBody SecureMap5161 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureMap5161";
    }
}
