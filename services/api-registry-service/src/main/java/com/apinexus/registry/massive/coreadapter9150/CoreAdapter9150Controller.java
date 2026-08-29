package com.apinexus.registry.massive.coreadapter9150;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/coreadapter9150")
public class CoreAdapter9150Controller {
    private final CoreAdapter9150Service service;
    
    public CoreAdapter9150Controller(CoreAdapter9150Service service) { this.service = service; }
    
    @GetMapping
    public List<CoreAdapter9150> getAll() { return service.findAll(); }
    
    @PostMapping
    public CoreAdapter9150 create(@RequestBody CoreAdapter9150 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CoreAdapter9150";
    }
}
