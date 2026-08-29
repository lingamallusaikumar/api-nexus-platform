package com.apinexus.registry.massive.zonetask3102;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/zonetask3102")
public class ZoneTask3102Controller {
    private final ZoneTask3102Service service;
    
    public ZoneTask3102Controller(ZoneTask3102Service service) { this.service = service; }
    
    @GetMapping
    public List<ZoneTask3102> getAll() { return service.findAll(); }
    
    @PostMapping
    public ZoneTask3102 create(@RequestBody ZoneTask3102 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ZoneTask3102";
    }
}
