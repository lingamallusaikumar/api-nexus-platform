package com.apinexus.registry.massive.regionmodule4449;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/regionmodule4449")
public class RegionModule4449Controller {
    private final RegionModule4449Service service;
    
    public RegionModule4449Controller(RegionModule4449Service service) { this.service = service; }
    
    @GetMapping
    public List<RegionModule4449> getAll() { return service.findAll(); }
    
    @PostMapping
    public RegionModule4449 create(@RequestBody RegionModule4449 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RegionModule4449";
    }
}
