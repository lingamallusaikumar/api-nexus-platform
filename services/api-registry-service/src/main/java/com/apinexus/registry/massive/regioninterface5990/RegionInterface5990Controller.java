package com.apinexus.registry.massive.regioninterface5990;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/regioninterface5990")
public class RegionInterface5990Controller {
    private final RegionInterface5990Service service;
    
    public RegionInterface5990Controller(RegionInterface5990Service service) { this.service = service; }
    
    @GetMapping
    public List<RegionInterface5990> getAll() { return service.findAll(); }
    
    @PostMapping
    public RegionInterface5990 create(@RequestBody RegionInterface5990 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RegionInterface5990";
    }
}
