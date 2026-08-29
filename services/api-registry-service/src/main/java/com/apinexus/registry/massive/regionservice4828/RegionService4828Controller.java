package com.apinexus.registry.massive.regionservice4828;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/regionservice4828")
public class RegionService4828Controller {
    private final RegionService4828Service service;
    
    public RegionService4828Controller(RegionService4828Service service) { this.service = service; }
    
    @GetMapping
    public List<RegionService4828> getAll() { return service.findAll(); }
    
    @PostMapping
    public RegionService4828 create(@RequestBody RegionService4828 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RegionService4828";
    }
}
