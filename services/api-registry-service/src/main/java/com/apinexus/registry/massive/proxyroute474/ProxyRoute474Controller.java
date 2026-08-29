package com.apinexus.registry.massive.proxyroute474;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxyroute474")
public class ProxyRoute474Controller {
    private final ProxyRoute474Service service;
    
    public ProxyRoute474Controller(ProxyRoute474Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyRoute474> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyRoute474 create(@RequestBody ProxyRoute474 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyRoute474";
    }
}
