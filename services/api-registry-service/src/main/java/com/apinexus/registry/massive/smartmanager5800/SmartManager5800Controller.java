package com.apinexus.registry.massive.smartmanager5800;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/smartmanager5800")
public class SmartManager5800Controller {
    private final SmartManager5800Service service;
    
    public SmartManager5800Controller(SmartManager5800Service service) { this.service = service; }
    
    @GetMapping
    public List<SmartManager5800> getAll() { return service.findAll(); }
    
    @PostMapping
    public SmartManager5800 create(@RequestBody SmartManager5800 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SmartManager5800";
    }
}
