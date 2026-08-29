package com.apinexus.registry.massive.proxynode7270;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxynode7270")
public class ProxyNode7270Controller {
    private final ProxyNode7270Service service;
    
    public ProxyNode7270Controller(ProxyNode7270Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyNode7270> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyNode7270 create(@RequestBody ProxyNode7270 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyNode7270";
    }
}
