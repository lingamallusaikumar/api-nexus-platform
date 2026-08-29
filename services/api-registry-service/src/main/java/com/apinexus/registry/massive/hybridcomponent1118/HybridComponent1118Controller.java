package com.apinexus.registry.massive.hybridcomponent1118;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hybridcomponent1118")
public class HybridComponent1118Controller {
    private final HybridComponent1118Service service;
    
    public HybridComponent1118Controller(HybridComponent1118Service service) { this.service = service; }
    
    @GetMapping
    public List<HybridComponent1118> getAll() { return service.findAll(); }
    
    @PostMapping
    public HybridComponent1118 create(@RequestBody HybridComponent1118 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HybridComponent1118";
    }
}
