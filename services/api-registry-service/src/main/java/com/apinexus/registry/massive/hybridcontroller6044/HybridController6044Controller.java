package com.apinexus.registry.massive.hybridcontroller6044;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hybridcontroller6044")
public class HybridController6044Controller {
    private final HybridController6044Service service;
    
    public HybridController6044Controller(HybridController6044Service service) { this.service = service; }
    
    @GetMapping
    public List<HybridController6044> getAll() { return service.findAll(); }
    
    @PostMapping
    public HybridController6044 create(@RequestBody HybridController6044 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HybridController6044";
    }
}
