package com.apinexus.registry.massive.secureengine4057;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/secureengine4057")
public class SecureEngine4057Controller {
    private final SecureEngine4057Service service;
    
    public SecureEngine4057Controller(SecureEngine4057Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureEngine4057> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureEngine4057 create(@RequestBody SecureEngine4057 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureEngine4057";
    }
}
