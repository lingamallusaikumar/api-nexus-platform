package com.apinexus.registry.massive.proxybridge412;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxybridge412")
public class ProxyBridge412Controller {
    private final ProxyBridge412Service service;
    
    public ProxyBridge412Controller(ProxyBridge412Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyBridge412> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyBridge412 create(@RequestBody ProxyBridge412 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyBridge412";
    }
}
