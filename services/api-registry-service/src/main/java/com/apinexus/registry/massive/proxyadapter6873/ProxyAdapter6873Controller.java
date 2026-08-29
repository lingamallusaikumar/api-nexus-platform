package com.apinexus.registry.massive.proxyadapter6873;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxyadapter6873")
public class ProxyAdapter6873Controller {
    private final ProxyAdapter6873Service service;
    
    public ProxyAdapter6873Controller(ProxyAdapter6873Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyAdapter6873> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyAdapter6873 create(@RequestBody ProxyAdapter6873 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyAdapter6873";
    }
}
