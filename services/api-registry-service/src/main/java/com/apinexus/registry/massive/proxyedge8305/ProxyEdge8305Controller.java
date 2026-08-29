package com.apinexus.registry.massive.proxyedge8305;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxyedge8305")
public class ProxyEdge8305Controller {
    private final ProxyEdge8305Service service;
    
    public ProxyEdge8305Controller(ProxyEdge8305Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyEdge8305> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyEdge8305 create(@RequestBody ProxyEdge8305 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyEdge8305";
    }
}
