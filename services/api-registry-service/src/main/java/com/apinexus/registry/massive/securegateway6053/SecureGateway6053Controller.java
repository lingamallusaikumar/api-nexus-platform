package com.apinexus.registry.massive.securegateway6053;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/securegateway6053")
public class SecureGateway6053Controller {
    private final SecureGateway6053Service service;
    
    public SecureGateway6053Controller(SecureGateway6053Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureGateway6053> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureGateway6053 create(@RequestBody SecureGateway6053 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureGateway6053";
    }
}
