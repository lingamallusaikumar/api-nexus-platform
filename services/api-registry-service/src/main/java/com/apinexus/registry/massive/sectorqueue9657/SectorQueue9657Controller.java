package com.apinexus.registry.massive.sectorqueue9657;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/sectorqueue9657")
public class SectorQueue9657Controller {
    private final SectorQueue9657Service service;
    
    public SectorQueue9657Controller(SectorQueue9657Service service) { this.service = service; }
    
    @GetMapping
    public List<SectorQueue9657> getAll() { return service.findAll(); }
    
    @PostMapping
    public SectorQueue9657 create(@RequestBody SectorQueue9657 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SectorQueue9657";
    }
}
