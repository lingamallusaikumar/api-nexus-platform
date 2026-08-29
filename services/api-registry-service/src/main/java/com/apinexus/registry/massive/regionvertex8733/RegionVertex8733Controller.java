package com.apinexus.registry.massive.regionvertex8733;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/regionvertex8733")
public class RegionVertex8733Controller {
    private final RegionVertex8733Service service;
    
    public RegionVertex8733Controller(RegionVertex8733Service service) { this.service = service; }
    
    @GetMapping
    public List<RegionVertex8733> getAll() { return service.findAll(); }
    
    @PostMapping
    public RegionVertex8733 create(@RequestBody RegionVertex8733 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RegionVertex8733";
    }
}
