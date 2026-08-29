package com.apinexus.registry.massive.hybridmap9701;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hybridmap9701")
public class HybridMap9701Controller {
    private final HybridMap9701Service service;
    
    public HybridMap9701Controller(HybridMap9701Service service) { this.service = service; }
    
    @GetMapping
    public List<HybridMap9701> getAll() { return service.findAll(); }
    
    @PostMapping
    public HybridMap9701 create(@RequestBody HybridMap9701 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HybridMap9701";
    }
}
