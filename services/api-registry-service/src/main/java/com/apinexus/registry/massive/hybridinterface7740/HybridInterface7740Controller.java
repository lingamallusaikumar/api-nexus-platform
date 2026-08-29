package com.apinexus.registry.massive.hybridinterface7740;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hybridinterface7740")
public class HybridInterface7740Controller {
    private final HybridInterface7740Service service;
    
    public HybridInterface7740Controller(HybridInterface7740Service service) { this.service = service; }
    
    @GetMapping
    public List<HybridInterface7740> getAll() { return service.findAll(); }
    
    @PostMapping
    public HybridInterface7740 create(@RequestBody HybridInterface7740 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HybridInterface7740";
    }
}
