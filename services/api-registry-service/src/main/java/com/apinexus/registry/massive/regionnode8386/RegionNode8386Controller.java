package com.apinexus.registry.massive.regionnode8386;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/regionnode8386")
public class RegionNode8386Controller {
    private final RegionNode8386Service service;
    
    public RegionNode8386Controller(RegionNode8386Service service) { this.service = service; }
    
    @GetMapping
    public List<RegionNode8386> getAll() { return service.findAll(); }
    
    @PostMapping
    public RegionNode8386 create(@RequestBody RegionNode8386 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RegionNode8386";
    }
}
