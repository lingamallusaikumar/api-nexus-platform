package com.apinexus.registry.massive.sectorarray8791;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/sectorarray8791")
public class SectorArray8791Controller {
    private final SectorArray8791Service service;
    
    public SectorArray8791Controller(SectorArray8791Service service) { this.service = service; }
    
    @GetMapping
    public List<SectorArray8791> getAll() { return service.findAll(); }
    
    @PostMapping
    public SectorArray8791 create(@RequestBody SectorArray8791 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SectorArray8791";
    }
}
