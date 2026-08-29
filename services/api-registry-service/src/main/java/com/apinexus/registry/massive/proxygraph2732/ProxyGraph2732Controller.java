package com.apinexus.registry.massive.proxygraph2732;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxygraph2732")
public class ProxyGraph2732Controller {
    private final ProxyGraph2732Service service;
    
    public ProxyGraph2732Controller(ProxyGraph2732Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyGraph2732> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyGraph2732 create(@RequestBody ProxyGraph2732 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyGraph2732";
    }
}
