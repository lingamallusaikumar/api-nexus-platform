package com.apinexus.registry.massive.proxylist637;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxylist637")
public class ProxyList637Controller {
    private final ProxyList637Service service;
    
    public ProxyList637Controller(ProxyList637Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyList637> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyList637 create(@RequestBody ProxyList637 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyList637";
    }
}
