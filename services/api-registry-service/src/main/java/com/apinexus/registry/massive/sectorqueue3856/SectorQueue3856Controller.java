package com.apinexus.registry.massive.sectorqueue3856;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/sectorqueue3856")
public class SectorQueue3856Controller {
    private final SectorQueue3856Service service;
    
    public SectorQueue3856Controller(SectorQueue3856Service service) { this.service = service; }
    
    @GetMapping
    public List<SectorQueue3856> getAll() { return service.findAll(); }
    
    @PostMapping
    public SectorQueue3856 create(@RequestBody SectorQueue3856 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SectorQueue3856";
    }
}
