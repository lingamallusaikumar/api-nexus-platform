package com.apinexus.registry.massive.hybridcomponent6733;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hybridcomponent6733")
public class HybridComponent6733Controller {
    private final HybridComponent6733Service service;
    
    public HybridComponent6733Controller(HybridComponent6733Service service) { this.service = service; }
    
    @GetMapping
    public List<HybridComponent6733> getAll() { return service.findAll(); }
    
    @PostMapping
    public HybridComponent6733 create(@RequestBody HybridComponent6733 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HybridComponent6733";
    }
}
