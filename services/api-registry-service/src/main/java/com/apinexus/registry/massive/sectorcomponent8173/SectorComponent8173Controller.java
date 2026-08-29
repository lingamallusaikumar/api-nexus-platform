package com.apinexus.registry.massive.sectorcomponent8173;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/sectorcomponent8173")
public class SectorComponent8173Controller {
    private final SectorComponent8173Service service;
    
    public SectorComponent8173Controller(SectorComponent8173Service service) { this.service = service; }
    
    @GetMapping
    public List<SectorComponent8173> getAll() { return service.findAll(); }
    
    @PostMapping
    public SectorComponent8173 create(@RequestBody SectorComponent8173 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SectorComponent8173";
    }
}
