package com.apinexus.registry.massive.regionbroker6540;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/regionbroker6540")
public class RegionBroker6540Controller {
    private final RegionBroker6540Service service;
    
    public RegionBroker6540Controller(RegionBroker6540Service service) { this.service = service; }
    
    @GetMapping
    public List<RegionBroker6540> getAll() { return service.findAll(); }
    
    @PostMapping
    public RegionBroker6540 create(@RequestBody RegionBroker6540 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RegionBroker6540";
    }
}
