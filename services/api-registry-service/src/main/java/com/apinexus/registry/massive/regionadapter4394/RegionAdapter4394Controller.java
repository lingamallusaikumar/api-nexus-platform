package com.apinexus.registry.massive.regionadapter4394;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/regionadapter4394")
public class RegionAdapter4394Controller {
    private final RegionAdapter4394Service service;
    
    public RegionAdapter4394Controller(RegionAdapter4394Service service) { this.service = service; }
    
    @GetMapping
    public List<RegionAdapter4394> getAll() { return service.findAll(); }
    
    @PostMapping
    public RegionAdapter4394 create(@RequestBody RegionAdapter4394 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RegionAdapter4394";
    }
}
