package com.apinexus.registry.massive.proxyvertex4832;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxyvertex4832")
public class ProxyVertex4832Controller {
    private final ProxyVertex4832Service service;
    
    public ProxyVertex4832Controller(ProxyVertex4832Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyVertex4832> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyVertex4832 create(@RequestBody ProxyVertex4832 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyVertex4832";
    }
}
