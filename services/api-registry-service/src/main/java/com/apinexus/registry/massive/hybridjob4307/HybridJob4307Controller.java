package com.apinexus.registry.massive.hybridjob4307;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hybridjob4307")
public class HybridJob4307Controller {
    private final HybridJob4307Service service;
    
    public HybridJob4307Controller(HybridJob4307Service service) { this.service = service; }
    
    @GetMapping
    public List<HybridJob4307> getAll() { return service.findAll(); }
    
    @PostMapping
    public HybridJob4307 create(@RequestBody HybridJob4307 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HybridJob4307";
    }
}
