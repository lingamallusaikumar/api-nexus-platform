package com.apinexus.registry.massive.zoneadapter6955;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/zoneadapter6955")
public class ZoneAdapter6955Controller {
    private final ZoneAdapter6955Service service;
    
    public ZoneAdapter6955Controller(ZoneAdapter6955Service service) { this.service = service; }
    
    @GetMapping
    public List<ZoneAdapter6955> getAll() { return service.findAll(); }
    
    @PostMapping
    public ZoneAdapter6955 create(@RequestBody ZoneAdapter6955 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ZoneAdapter6955";
    }
}
