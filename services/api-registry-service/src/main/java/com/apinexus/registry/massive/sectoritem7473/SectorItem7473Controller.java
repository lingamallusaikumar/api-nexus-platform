package com.apinexus.registry.massive.sectoritem7473;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/sectoritem7473")
public class SectorItem7473Controller {
    private final SectorItem7473Service service;
    
    public SectorItem7473Controller(SectorItem7473Service service) { this.service = service; }
    
    @GetMapping
    public List<SectorItem7473> getAll() { return service.findAll(); }
    
    @PostMapping
    public SectorItem7473 create(@RequestBody SectorItem7473 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SectorItem7473";
    }
}
