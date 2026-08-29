package com.apinexus.registry.massive.proxyqueue57;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxyqueue57")
public class ProxyQueue57Controller {
    private final ProxyQueue57Service service;
    
    public ProxyQueue57Controller(ProxyQueue57Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyQueue57> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyQueue57 create(@RequestBody ProxyQueue57 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyQueue57";
    }
}
