package com.apinexus.registry.massive.zonejob4119;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/zonejob4119")
public class ZoneJob4119Controller {
    private final ZoneJob4119Service service;
    
    public ZoneJob4119Controller(ZoneJob4119Service service) { this.service = service; }
    
    @GetMapping
    public List<ZoneJob4119> getAll() { return service.findAll(); }
    
    @PostMapping
    public ZoneJob4119 create(@RequestBody ZoneJob4119 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ZoneJob4119";
    }
}
