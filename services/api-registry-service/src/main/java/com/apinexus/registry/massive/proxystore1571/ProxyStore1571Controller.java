package com.apinexus.registry.massive.proxystore1571;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxystore1571")
public class ProxyStore1571Controller {
    private final ProxyStore1571Service service;
    
    public ProxyStore1571Controller(ProxyStore1571Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyStore1571> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyStore1571 create(@RequestBody ProxyStore1571 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyStore1571";
    }
}
