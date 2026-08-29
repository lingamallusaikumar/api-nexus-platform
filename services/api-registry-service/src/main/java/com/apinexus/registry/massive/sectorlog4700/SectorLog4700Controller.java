package com.apinexus.registry.massive.sectorlog4700;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/sectorlog4700")
public class SectorLog4700Controller {
    private final SectorLog4700Service service;
    
    public SectorLog4700Controller(SectorLog4700Service service) { this.service = service; }
    
    @GetMapping
    public List<SectorLog4700> getAll() { return service.findAll(); }
    
    @PostMapping
    public SectorLog4700 create(@RequestBody SectorLog4700 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SectorLog4700";
    }
}
