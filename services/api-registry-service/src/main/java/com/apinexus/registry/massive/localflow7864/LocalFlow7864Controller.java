package com.apinexus.registry.massive.localflow7864;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/localflow7864")
public class LocalFlow7864Controller {
    private final LocalFlow7864Service service;
    
    public LocalFlow7864Controller(LocalFlow7864Service service) { this.service = service; }
    
    @GetMapping
    public List<LocalFlow7864> getAll() { return service.findAll(); }
    
    @PostMapping
    public LocalFlow7864 create(@RequestBody LocalFlow7864 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed LocalFlow7864";
    }
}
