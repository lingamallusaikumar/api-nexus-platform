package com.apinexus.registry.massive.sectorportal9667;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/sectorportal9667")
public class SectorPortal9667Controller {
    private final SectorPortal9667Service service;
    
    public SectorPortal9667Controller(SectorPortal9667Service service) { this.service = service; }
    
    @GetMapping
    public List<SectorPortal9667> getAll() { return service.findAll(); }
    
    @PostMapping
    public SectorPortal9667 create(@RequestBody SectorPortal9667 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SectorPortal9667";
    }
}
