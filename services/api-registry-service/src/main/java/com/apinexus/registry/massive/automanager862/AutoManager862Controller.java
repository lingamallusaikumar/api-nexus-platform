package com.apinexus.registry.massive.automanager862;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/automanager862")
public class AutoManager862Controller {
    private final AutoManager862Service service;
    
    public AutoManager862Controller(AutoManager862Service service) { this.service = service; }
    
    @GetMapping
    public List<AutoManager862> getAll() { return service.findAll(); }
    
    @PostMapping
    public AutoManager862 create(@RequestBody AutoManager862 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AutoManager862";
    }
}
