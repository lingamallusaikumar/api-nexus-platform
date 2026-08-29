package com.apinexus.registry.massive.zonejob3883;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/zonejob3883")
public class ZoneJob3883Controller {
    private final ZoneJob3883Service service;
    
    public ZoneJob3883Controller(ZoneJob3883Service service) { this.service = service; }
    
    @GetMapping
    public List<ZoneJob3883> getAll() { return service.findAll(); }
    
    @PostMapping
    public ZoneJob3883 create(@RequestBody ZoneJob3883 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ZoneJob3883";
    }
}
