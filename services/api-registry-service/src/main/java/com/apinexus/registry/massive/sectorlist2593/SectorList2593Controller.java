package com.apinexus.registry.massive.sectorlist2593;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/sectorlist2593")
public class SectorList2593Controller {
    private final SectorList2593Service service;
    
    public SectorList2593Controller(SectorList2593Service service) { this.service = service; }
    
    @GetMapping
    public List<SectorList2593> getAll() { return service.findAll(); }
    
    @PostMapping
    public SectorList2593 create(@RequestBody SectorList2593 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SectorList2593";
    }
}
