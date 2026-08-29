package com.apinexus.registry.massive.smartflow4844;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/smartflow4844")
public class SmartFlow4844Controller {
    private final SmartFlow4844Service service;
    
    public SmartFlow4844Controller(SmartFlow4844Service service) { this.service = service; }
    
    @GetMapping
    public List<SmartFlow4844> getAll() { return service.findAll(); }
    
    @PostMapping
    public SmartFlow4844 create(@RequestBody SmartFlow4844 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SmartFlow4844";
    }
}
