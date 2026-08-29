package com.apinexus.registry.massive.zonerecord7653;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/zonerecord7653")
public class ZoneRecord7653Controller {
    private final ZoneRecord7653Service service;
    
    public ZoneRecord7653Controller(ZoneRecord7653Service service) { this.service = service; }
    
    @GetMapping
    public List<ZoneRecord7653> getAll() { return service.findAll(); }
    
    @PostMapping
    public ZoneRecord7653 create(@RequestBody ZoneRecord7653 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ZoneRecord7653";
    }
}
