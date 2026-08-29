package com.apinexus.registry.massive.sectoragent3353;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/sectoragent3353")
public class SectorAgent3353Controller {
    private final SectorAgent3353Service service;
    
    public SectorAgent3353Controller(SectorAgent3353Service service) { this.service = service; }
    
    @GetMapping
    public List<SectorAgent3353> getAll() { return service.findAll(); }
    
    @PostMapping
    public SectorAgent3353 create(@RequestBody SectorAgent3353 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SectorAgent3353";
    }
}
