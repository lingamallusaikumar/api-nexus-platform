package com.apinexus.registry.massive.sectorpool306;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/sectorpool306")
public class SectorPool306Controller {
    private final SectorPool306Service service;
    
    public SectorPool306Controller(SectorPool306Service service) { this.service = service; }
    
    @GetMapping
    public List<SectorPool306> getAll() { return service.findAll(); }
    
    @PostMapping
    public SectorPool306 create(@RequestBody SectorPool306 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SectorPool306";
    }
}
