package com.apinexus.registry.massive.proxyinterface9546;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxyinterface9546")
public class ProxyInterface9546Controller {
    private final ProxyInterface9546Service service;
    
    public ProxyInterface9546Controller(ProxyInterface9546Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyInterface9546> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyInterface9546 create(@RequestBody ProxyInterface9546 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyInterface9546";
    }
}
