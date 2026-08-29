package com.apinexus.registry.massive.hybridbridge7257;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hybridbridge7257")
public class HybridBridge7257Controller {
    private final HybridBridge7257Service service;
    
    public HybridBridge7257Controller(HybridBridge7257Service service) { this.service = service; }
    
    @GetMapping
    public List<HybridBridge7257> getAll() { return service.findAll(); }
    
    @PostMapping
    public HybridBridge7257 create(@RequestBody HybridBridge7257 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HybridBridge7257";
    }
}
