package com.apinexus.registry.massive.regionpath9122;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/regionpath9122")
public class RegionPath9122Controller {
    private final RegionPath9122Service service;
    
    public RegionPath9122Controller(RegionPath9122Service service) { this.service = service; }
    
    @GetMapping
    public List<RegionPath9122> getAll() { return service.findAll(); }
    
    @PostMapping
    public RegionPath9122 create(@RequestBody RegionPath9122 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RegionPath9122";
    }
}
