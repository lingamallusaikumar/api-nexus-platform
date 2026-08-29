package com.apinexus.registry.massive.zoneitem1511;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/zoneitem1511")
public class ZoneItem1511Controller {
    private final ZoneItem1511Service service;
    
    public ZoneItem1511Controller(ZoneItem1511Service service) { this.service = service; }
    
    @GetMapping
    public List<ZoneItem1511> getAll() { return service.findAll(); }
    
    @PostMapping
    public ZoneItem1511 create(@RequestBody ZoneItem1511 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ZoneItem1511";
    }
}
