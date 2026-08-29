package com.apinexus.registry.massive.regiondatabase3344;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/regiondatabase3344")
public class RegionDatabase3344Controller {
    private final RegionDatabase3344Service service;
    
    public RegionDatabase3344Controller(RegionDatabase3344Service service) { this.service = service; }
    
    @GetMapping
    public List<RegionDatabase3344> getAll() { return service.findAll(); }
    
    @PostMapping
    public RegionDatabase3344 create(@RequestBody RegionDatabase3344 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RegionDatabase3344";
    }
}
