package com.apinexus.registry.massive.proxybuffer771;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/proxybuffer771")
public class ProxyBuffer771Controller {
    private final ProxyBuffer771Service service;
    
    public ProxyBuffer771Controller(ProxyBuffer771Service service) { this.service = service; }
    
    @GetMapping
    public List<ProxyBuffer771> getAll() { return service.findAll(); }
    
    @PostMapping
    public ProxyBuffer771 create(@RequestBody ProxyBuffer771 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ProxyBuffer771";
    }
}
