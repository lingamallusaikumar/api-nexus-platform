package com.apinexus.registry.massive.proxylist2571;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxylist2571")
public class ProxyList2571Controller {
    private final ProxyList2571Service service;
    
    public ProxyList2571Controller(ProxyList2571Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyList2571> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyList2571 create(@RequestBody ProxyList2571 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyList2571";
    }
}
