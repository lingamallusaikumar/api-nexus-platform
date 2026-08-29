package com.apinexus.registry.massive.sectoradapter2115;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/sectoradapter2115")
public class SectorAdapter2115Controller {
    private final SectorAdapter2115Service service;
    
    public SectorAdapter2115Controller(SectorAdapter2115Service service) { this.service = service; }
    
    @GetMapping
    public List<SectorAdapter2115> getAll() { return service.findAll(); }
    
    @PostMapping
    public SectorAdapter2115 create(@RequestBody SectorAdapter2115 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SectorAdapter2115";
    }
}
