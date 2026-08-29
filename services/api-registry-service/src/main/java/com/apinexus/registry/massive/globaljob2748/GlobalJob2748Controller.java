package com.apinexus.registry.massive.globaljob2748;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/globaljob2748")
public class GlobalJob2748Controller {
    private final GlobalJob2748Service service;
    
    public GlobalJob2748Controller(GlobalJob2748Service service) { this.service = service; }
    
    @GetMapping
    public List<GlobalJob2748> getAll() { return service.findAll(); }
    
    @PostMapping
    public GlobalJob2748 create(@RequestBody GlobalJob2748 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GlobalJob2748";
    }
}
