package com.apinexus.registry.massive.proxymodule1800;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxymodule1800")
public class ProxyModule1800Controller {
    private final ProxyModule1800Service service;
    
    public ProxyModule1800Controller(ProxyModule1800Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyModule1800> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyModule1800 create(@RequestBody ProxyModule1800 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyModule1800";
    }
}
