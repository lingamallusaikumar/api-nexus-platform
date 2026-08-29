package com.apinexus.registry.massive.localstore1134;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/localstore1134")
public class LocalStore1134Controller {
    private final LocalStore1134Service service;
    
    public LocalStore1134Controller(LocalStore1134Service service) { this.service = service; }
    
    @GetMapping
    public List<LocalStore1134> getAll() { return service.findAll(); }
    
    @PostMapping
    public LocalStore1134 create(@RequestBody LocalStore1134 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed LocalStore1134";
    }
}
