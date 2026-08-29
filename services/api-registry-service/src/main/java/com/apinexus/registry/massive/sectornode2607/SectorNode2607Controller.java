package com.apinexus.registry.massive.sectornode2607;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/sectornode2607")
public class SectorNode2607Controller {
    private final SectorNode2607Service service;
    
    public SectorNode2607Controller(SectorNode2607Service service) { this.service = service; }
    
    @GetMapping
    public List<SectorNode2607> getAll() { return service.findAll(); }
    
    @PostMapping
    public SectorNode2607 create(@RequestBody SectorNode2607 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SectorNode2607";
    }
}
