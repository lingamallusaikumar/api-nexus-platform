package com.apinexus.registry.massive.regioncontroller3472;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/regioncontroller3472")
public class RegionController3472Controller {
    private final RegionController3472Service service;
    
    public RegionController3472Controller(RegionController3472Service service) { this.service = service; }
    
    @GetMapping
    public List<RegionController3472> getAll() { return service.findAll(); }
    
    @PostMapping
    public RegionController3472 create(@RequestBody RegionController3472 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RegionController3472";
    }
}
