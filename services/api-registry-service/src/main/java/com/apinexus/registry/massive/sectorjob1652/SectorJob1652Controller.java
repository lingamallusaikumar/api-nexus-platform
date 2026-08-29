package com.apinexus.registry.massive.sectorjob1652;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/sectorjob1652")
public class SectorJob1652Controller {
    private final SectorJob1652Service service;
    
    public SectorJob1652Controller(SectorJob1652Service service) { this.service = service; }
    
    @GetMapping
    public List<SectorJob1652> getAll() { return service.findAll(); }
    
    @PostMapping
    public SectorJob1652 create(@RequestBody SectorJob1652 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SectorJob1652";
    }
}
