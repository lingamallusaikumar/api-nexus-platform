package com.apinexus.registry.massive.dynamicroute5289;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dynamicroute5289")
public class DynamicRoute5289Controller {
    private final DynamicRoute5289Service service;
    
    public DynamicRoute5289Controller(DynamicRoute5289Service service) { this.service = service; }
    
    @GetMapping
    public List<DynamicRoute5289> getAll() { return service.findAll(); }
    
    @PostMapping
    public DynamicRoute5289 create(@RequestBody DynamicRoute5289 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DynamicRoute5289";
    }
}
