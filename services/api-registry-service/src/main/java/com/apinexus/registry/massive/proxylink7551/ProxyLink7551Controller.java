package com.apinexus.registry.massive.proxylink7551;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxylink7551")
public class ProxyLink7551Controller {
    private final ProxyLink7551Service service;
    
    public ProxyLink7551Controller(ProxyLink7551Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyLink7551> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyLink7551 create(@RequestBody ProxyLink7551 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyLink7551";
    }
}
