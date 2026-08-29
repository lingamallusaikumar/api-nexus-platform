package com.apinexus.registry.massive.globalpool8080;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/globalpool8080")
public class GlobalPool8080Controller {
    private final GlobalPool8080Service service;
    
    public GlobalPool8080Controller(GlobalPool8080Service service) { this.service = service; }
    
    @GetMapping
    public List<GlobalPool8080> getAll() { return service.findAll(); }
    
    @PostMapping
    public GlobalPool8080 create(@RequestBody GlobalPool8080 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GlobalPool8080";
    }
}
