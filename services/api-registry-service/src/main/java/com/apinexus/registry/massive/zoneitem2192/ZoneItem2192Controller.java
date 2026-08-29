package com.apinexus.registry.massive.zoneitem2192;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/zoneitem2192")
public class ZoneItem2192Controller {
    private final ZoneItem2192Service service;
    
    public ZoneItem2192Controller(ZoneItem2192Service service) { this.service = service; }
    
    @GetMapping
    public List<ZoneItem2192> getAll() { return service.findAll(); }
    
    @PostMapping
    public ZoneItem2192 create(@RequestBody ZoneItem2192 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ZoneItem2192";
    }
}
