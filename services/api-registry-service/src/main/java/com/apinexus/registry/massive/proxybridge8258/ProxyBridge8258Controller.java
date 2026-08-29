package com.apinexus.registry.massive.proxybridge8258;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxybridge8258")
public class ProxyBridge8258Controller {
    private final ProxyBridge8258Service service;
    
    public ProxyBridge8258Controller(ProxyBridge8258Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyBridge8258> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyBridge8258 create(@RequestBody ProxyBridge8258 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyBridge8258";
    }
}
