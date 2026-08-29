package com.apinexus.registry.massive.proxysystem8828;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxysystem8828")
public class ProxySystem8828Controller {
    private final ProxySystem8828Service service;
    
    public ProxySystem8828Controller(ProxySystem8828Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxySystem8828> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxySystem8828 create(@RequestBody ProxySystem8828 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxySystem8828";
    }
}
