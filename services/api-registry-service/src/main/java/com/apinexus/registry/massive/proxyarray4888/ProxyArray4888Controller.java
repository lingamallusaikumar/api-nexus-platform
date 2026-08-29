package com.apinexus.registry.massive.proxyarray4888;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxyarray4888")
public class ProxyArray4888Controller {
    private final ProxyArray4888Service service;
    
    public ProxyArray4888Controller(ProxyArray4888Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyArray4888> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyArray4888 create(@RequestBody ProxyArray4888 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyArray4888";
    }
}
