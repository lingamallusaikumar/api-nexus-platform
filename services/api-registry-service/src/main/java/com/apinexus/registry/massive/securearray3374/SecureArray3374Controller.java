package com.apinexus.registry.massive.securearray3374;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/securearray3374")
public class SecureArray3374Controller {
    private final SecureArray3374Service service;
    
    public SecureArray3374Controller(SecureArray3374Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureArray3374> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureArray3374 create(@RequestBody SecureArray3374 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureArray3374";
    }
}
