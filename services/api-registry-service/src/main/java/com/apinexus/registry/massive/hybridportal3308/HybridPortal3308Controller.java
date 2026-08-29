package com.apinexus.registry.massive.hybridportal3308;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hybridportal3308")
public class HybridPortal3308Controller {
    private final HybridPortal3308Service service;
    
    public HybridPortal3308Controller(HybridPortal3308Service service) { this.service = service; }
    
    @GetMapping
    public List<HybridPortal3308> getAll() { return service.findAll(); }
    
    @PostMapping
    public HybridPortal3308 create(@RequestBody HybridPortal3308 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HybridPortal3308";
    }
}
