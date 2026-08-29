package com.apinexus.registry.massive.proxygraph2323;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxygraph2323")
public class ProxyGraph2323Controller {
    private final ProxyGraph2323Service service;
    
    public ProxyGraph2323Controller(ProxyGraph2323Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyGraph2323> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyGraph2323 create(@RequestBody ProxyGraph2323 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyGraph2323";
    }
}
