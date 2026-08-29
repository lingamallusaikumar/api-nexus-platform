package com.apinexus.registry.massive.zoneitem2392;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/zoneitem2392")
public class ZoneItem2392Controller {
    private final ZoneItem2392Service service;
    
    public ZoneItem2392Controller(ZoneItem2392Service service) { this.service = service; }
    
    @GetMapping
    public List<ZoneItem2392> getAll() { return service.findAll(); }
    
    @PostMapping
    public ZoneItem2392 create(@RequestBody ZoneItem2392 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ZoneItem2392";
    }
}
