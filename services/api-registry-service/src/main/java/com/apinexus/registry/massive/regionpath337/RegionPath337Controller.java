package com.apinexus.registry.massive.regionpath337;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/regionpath337")
public class RegionPath337Controller {
    private final RegionPath337Service service;
    
    public RegionPath337Controller(RegionPath337Service service) { this.service = service; }
    
    @GetMapping
    public List<RegionPath337> getAll() { return service.findAll(); }
    
    @PostMapping
    public RegionPath337 create(@RequestBody RegionPath337 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RegionPath337";
    }
}
