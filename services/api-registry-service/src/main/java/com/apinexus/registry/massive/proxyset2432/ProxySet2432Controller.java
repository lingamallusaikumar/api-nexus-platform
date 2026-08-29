package com.apinexus.registry.massive.proxyset2432;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxyset2432")
public class ProxySet2432Controller {
    private final ProxySet2432Service service;
    
    public ProxySet2432Controller(ProxySet2432Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxySet2432> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxySet2432 create(@RequestBody ProxySet2432 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxySet2432";
    }
}
