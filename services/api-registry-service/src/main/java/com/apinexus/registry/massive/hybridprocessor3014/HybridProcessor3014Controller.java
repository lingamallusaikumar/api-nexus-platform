package com.apinexus.registry.massive.hybridprocessor3014;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hybridprocessor3014")
public class HybridProcessor3014Controller {
    private final HybridProcessor3014Service service;
    
    public HybridProcessor3014Controller(HybridProcessor3014Service service) { this.service = service; }
    
    @GetMapping
    public List<HybridProcessor3014> getAll() { return service.findAll(); }
    
    @PostMapping
    public HybridProcessor3014 create(@RequestBody HybridProcessor3014 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HybridProcessor3014";
    }
}
