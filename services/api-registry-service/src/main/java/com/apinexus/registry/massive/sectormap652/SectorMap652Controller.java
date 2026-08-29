package com.apinexus.registry.massive.sectormap652;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/sectormap652")
public class SectorMap652Controller {
    private final SectorMap652Service service;
    
    public SectorMap652Controller(SectorMap652Service service) { this.service = service; }
    
    @GetMapping
    public List<SectorMap652> getAll() { return service.findAll(); }
    
    @PostMapping
    public SectorMap652 create(@RequestBody SectorMap652 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SectorMap652";
    }
}
