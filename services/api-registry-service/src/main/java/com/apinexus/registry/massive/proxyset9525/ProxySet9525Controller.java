package com.apinexus.registry.massive.proxyset9525;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxyset9525")
public class ProxySet9525Controller {
    private final ProxySet9525Service service;
    
    public ProxySet9525Controller(ProxySet9525Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxySet9525> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxySet9525 create(@RequestBody ProxySet9525 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxySet9525";
    }
}
