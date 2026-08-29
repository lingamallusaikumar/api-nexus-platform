package com.apinexus.registry.massive.regionitem398;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/regionitem398")
public class RegionItem398Controller {
    private final RegionItem398Service service;
    
    public RegionItem398Controller(RegionItem398Service service) { this.service = service; }
    
    @GetMapping
    public List<RegionItem398> getAll() { return service.findAll(); }
    
    @PostMapping
    public RegionItem398 create(@RequestBody RegionItem398 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RegionItem398";
    }
}
