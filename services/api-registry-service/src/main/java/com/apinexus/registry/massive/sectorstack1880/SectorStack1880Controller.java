package com.apinexus.registry.massive.sectorstack1880;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/sectorstack1880")
public class SectorStack1880Controller {
    private final SectorStack1880Service service;
    
    public SectorStack1880Controller(SectorStack1880Service service) { this.service = service; }
    
    @GetMapping
    public List<SectorStack1880> getAll() { return service.findAll(); }
    
    @PostMapping
    public SectorStack1880 create(@RequestBody SectorStack1880 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SectorStack1880";
    }
}
