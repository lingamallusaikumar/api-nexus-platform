package com.apinexus.registry.massive.securemodule2949;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/securemodule2949")
public class SecureModule2949Controller {
    private final SecureModule2949Service service;
    
    public SecureModule2949Controller(SecureModule2949Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureModule2949> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureModule2949 create(@RequestBody SecureModule2949 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureModule2949";
    }
}
