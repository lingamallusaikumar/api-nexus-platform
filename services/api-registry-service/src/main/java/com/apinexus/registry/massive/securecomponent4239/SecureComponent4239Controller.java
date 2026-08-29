package com.apinexus.registry.massive.securecomponent4239;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/securecomponent4239")
public class SecureComponent4239Controller {
    private final SecureComponent4239Service service;
    
    public SecureComponent4239Controller(SecureComponent4239Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureComponent4239> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureComponent4239 create(@RequestBody SecureComponent4239 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureComponent4239";
    }
}
