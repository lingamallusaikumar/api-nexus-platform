package com.apinexus.registry.massive.securebridge1672;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/securebridge1672")
public class SecureBridge1672Controller {
    private final SecureBridge1672Service service;
    
    public SecureBridge1672Controller(SecureBridge1672Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureBridge1672> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureBridge1672 create(@RequestBody SecureBridge1672 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureBridge1672";
    }
}
