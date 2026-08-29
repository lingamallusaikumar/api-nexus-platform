package com.apinexus.registry.massive.zonearray1468;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/zonearray1468")
public class ZoneArray1468Controller {
    private final ZoneArray1468Service service;
    
    public ZoneArray1468Controller(ZoneArray1468Service service) { this.service = service; }
    
    @GetMapping
    public List<ZoneArray1468> getAll() { return service.findAll(); }
    
    @PostMapping
    public ZoneArray1468 create(@RequestBody ZoneArray1468 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ZoneArray1468";
    }
}
