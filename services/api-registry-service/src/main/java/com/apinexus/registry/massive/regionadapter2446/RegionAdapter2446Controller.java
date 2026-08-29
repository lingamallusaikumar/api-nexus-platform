package com.apinexus.registry.massive.regionadapter2446;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/regionadapter2446")
public class RegionAdapter2446Controller {
    private final RegionAdapter2446Service service;
    
    public RegionAdapter2446Controller(RegionAdapter2446Service service) { this.service = service; }
    
    @GetMapping
    public List<RegionAdapter2446> getAll() { return service.findAll(); }
    
    @PostMapping
    public RegionAdapter2446 create(@RequestBody RegionAdapter2446 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RegionAdapter2446";
    }
}
