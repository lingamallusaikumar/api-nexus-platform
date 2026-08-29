package com.apinexus.registry.massive.regionportal1412;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/regionportal1412")
public class RegionPortal1412Controller {
    private final RegionPortal1412Service service;
    
    public RegionPortal1412Controller(RegionPortal1412Service service) { this.service = service; }
    
    @GetMapping
    public List<RegionPortal1412> getAll() { return service.findAll(); }
    
    @PostMapping
    public RegionPortal1412 create(@RequestBody RegionPortal1412 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RegionPortal1412";
    }
}
