package com.apinexus.registry.massive.proxydispatcher4299;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxydispatcher4299")
public class ProxyDispatcher4299Controller {
    private final ProxyDispatcher4299Service service;
    
    public ProxyDispatcher4299Controller(ProxyDispatcher4299Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyDispatcher4299> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyDispatcher4299 create(@RequestBody ProxyDispatcher4299 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyDispatcher4299";
    }
}
