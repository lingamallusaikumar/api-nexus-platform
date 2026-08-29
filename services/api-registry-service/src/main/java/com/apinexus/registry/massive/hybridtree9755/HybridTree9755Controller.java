package com.apinexus.registry.massive.hybridtree9755;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hybridtree9755")
public class HybridTree9755Controller {
    private final HybridTree9755Service service;
    
    public HybridTree9755Controller(HybridTree9755Service service) { this.service = service; }
    
    @GetMapping
    public List<HybridTree9755> getAll() { return service.findAll(); }
    
    @PostMapping
    public HybridTree9755 create(@RequestBody HybridTree9755 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HybridTree9755";
    }
}
