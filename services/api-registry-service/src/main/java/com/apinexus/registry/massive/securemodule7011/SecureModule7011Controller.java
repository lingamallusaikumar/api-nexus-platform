package com.apinexus.registry.massive.securemodule7011;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/securemodule7011")
public class SecureModule7011Controller {
    private final SecureModule7011Service service;
    
    public SecureModule7011Controller(SecureModule7011Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureModule7011> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureModule7011 create(@RequestBody SecureModule7011 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureModule7011";
    }
}
