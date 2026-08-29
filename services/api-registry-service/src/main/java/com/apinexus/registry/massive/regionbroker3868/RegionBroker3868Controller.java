package com.apinexus.registry.massive.regionbroker3868;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/regionbroker3868")
public class RegionBroker3868Controller {
    private final RegionBroker3868Service service;
    
    public RegionBroker3868Controller(RegionBroker3868Service service) { this.service = service; }
    
    @GetMapping
    public List<RegionBroker3868> getAll() { return service.findAll(); }
    
    @PostMapping
    public RegionBroker3868 create(@RequestBody RegionBroker3868 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RegionBroker3868";
    }
}
