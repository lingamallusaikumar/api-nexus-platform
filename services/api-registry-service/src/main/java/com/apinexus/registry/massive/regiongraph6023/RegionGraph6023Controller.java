package com.apinexus.registry.massive.regiongraph6023;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/regiongraph6023")
public class RegionGraph6023Controller {
    private final RegionGraph6023Service service;
    
    public RegionGraph6023Controller(RegionGraph6023Service service) { this.service = service; }
    
    @GetMapping
    public List<RegionGraph6023> getAll() { return service.findAll(); }
    
    @PostMapping
    public RegionGraph6023 create(@RequestBody RegionGraph6023 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RegionGraph6023";
    }
}
