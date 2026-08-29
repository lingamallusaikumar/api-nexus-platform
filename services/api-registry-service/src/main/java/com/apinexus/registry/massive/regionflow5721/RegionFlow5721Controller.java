package com.apinexus.registry.massive.regionflow5721;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/regionflow5721")
public class RegionFlow5721Controller {
    private final RegionFlow5721Service service;
    
    public RegionFlow5721Controller(RegionFlow5721Service service) { this.service = service; }
    
    @GetMapping
    public List<RegionFlow5721> getAll() { return service.findAll(); }
    
    @PostMapping
    public RegionFlow5721 create(@RequestBody RegionFlow5721 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RegionFlow5721";
    }
}
