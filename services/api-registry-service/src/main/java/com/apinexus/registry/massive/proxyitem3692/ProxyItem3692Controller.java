package com.apinexus.registry.massive.proxyitem3692;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxyitem3692")
public class ProxyItem3692Controller {
    private final ProxyItem3692Service service;
    
    public ProxyItem3692Controller(ProxyItem3692Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyItem3692> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyItem3692 create(@RequestBody ProxyItem3692 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyItem3692";
    }
}
