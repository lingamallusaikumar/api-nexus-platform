package com.apinexus.registry.massive.proxystack3558;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxystack3558")
public class ProxyStack3558Controller {
    private final ProxyStack3558Service service;
    
    public ProxyStack3558Controller(ProxyStack3558Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyStack3558> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyStack3558 create(@RequestBody ProxyStack3558 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyStack3558";
    }
}
