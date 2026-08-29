package com.apinexus.registry.massive.hybridstore5599;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hybridstore5599")
public class HybridStore5599Controller {
    private final HybridStore5599Service service;
    
    public HybridStore5599Controller(HybridStore5599Service service) { this.service = service; }
    
    @GetMapping
    public List<HybridStore5599> getAll() { return service.findAll(); }
    
    @PostMapping
    public HybridStore5599 create(@RequestBody HybridStore5599 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HybridStore5599";
    }
}
