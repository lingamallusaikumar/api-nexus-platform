package com.apinexus.registry.massive.regionqueue1618;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/regionqueue1618")
public class RegionQueue1618Controller {
    private final RegionQueue1618Service service;
    
    public RegionQueue1618Controller(RegionQueue1618Service service) { this.service = service; }
    
    @GetMapping
    public List<RegionQueue1618> getAll() { return service.findAll(); }
    
    @PostMapping
    public RegionQueue1618 create(@RequestBody RegionQueue1618 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RegionQueue1618";
    }
}
