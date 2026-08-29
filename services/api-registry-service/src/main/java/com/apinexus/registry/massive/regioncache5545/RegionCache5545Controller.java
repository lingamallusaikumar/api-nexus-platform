package com.apinexus.registry.massive.regioncache5545;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/regioncache5545")
public class RegionCache5545Controller {
    private final RegionCache5545Service service;
    
    public RegionCache5545Controller(RegionCache5545Service service) { this.service = service; }
    
    @GetMapping
    public List<RegionCache5545> getAll() { return service.findAll(); }
    
    @PostMapping
    public RegionCache5545 create(@RequestBody RegionCache5545 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RegionCache5545";
    }
}
