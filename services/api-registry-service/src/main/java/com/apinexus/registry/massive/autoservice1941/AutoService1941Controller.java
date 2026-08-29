package com.apinexus.registry.massive.autoservice1941;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/autoservice1941")
public class AutoService1941Controller {
    private final AutoService1941Service service;
    
    public AutoService1941Controller(AutoService1941Service service) { this.service = service; }
    
    @GetMapping
    public List<AutoService1941> getAll() { return service.findAll(); }
    
    @PostMapping
    public AutoService1941 create(@RequestBody AutoService1941 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AutoService1941";
    }
}
