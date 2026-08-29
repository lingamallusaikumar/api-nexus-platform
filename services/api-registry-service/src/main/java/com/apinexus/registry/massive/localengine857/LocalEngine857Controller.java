package com.apinexus.registry.massive.localengine857;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/localengine857")
public class LocalEngine857Controller {
    private final LocalEngine857Service service;
    
    public LocalEngine857Controller(LocalEngine857Service service) { this.service = service; }
    
    @GetMapping
    public List<LocalEngine857> getAll() { return service.findAll(); }
    
    @PostMapping
    public LocalEngine857 create(@RequestBody LocalEngine857 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed LocalEngine857";
    }
}
