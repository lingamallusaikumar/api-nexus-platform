package com.apinexus.registry.massive.sectorqueue1679;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/sectorqueue1679")
public class SectorQueue1679Controller {
    private final SectorQueue1679Service service;
    
    public SectorQueue1679Controller(SectorQueue1679Service service) { this.service = service; }
    
    @GetMapping
    public List<SectorQueue1679> getAll() { return service.findAll(); }
    
    @PostMapping
    public SectorQueue1679 create(@RequestBody SectorQueue1679 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SectorQueue1679";
    }
}
