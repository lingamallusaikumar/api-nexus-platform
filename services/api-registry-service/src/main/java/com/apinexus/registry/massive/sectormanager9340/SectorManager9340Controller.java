package com.apinexus.registry.massive.sectormanager9340;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/sectormanager9340")
public class SectorManager9340Controller {
    private final SectorManager9340Service service;
    
    public SectorManager9340Controller(SectorManager9340Service service) { this.service = service; }
    
    @GetMapping
    public List<SectorManager9340> getAll() { return service.findAll(); }
    
    @PostMapping
    public SectorManager9340 create(@RequestBody SectorManager9340 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SectorManager9340";
    }
}
