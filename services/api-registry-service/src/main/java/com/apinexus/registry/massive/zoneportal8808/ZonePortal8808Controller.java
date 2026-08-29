package com.apinexus.registry.massive.zoneportal8808;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/zoneportal8808")
public class ZonePortal8808Controller {
    private final ZonePortal8808Service service;
    
    public ZonePortal8808Controller(ZonePortal8808Service service) { this.service = service; }
    
    @GetMapping
    public List<ZonePortal8808> getAll() { return service.findAll(); }
    
    @PostMapping
    public ZonePortal8808 create(@RequestBody ZonePortal8808 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ZonePortal8808";
    }
}
