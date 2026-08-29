package com.apinexus.registry.massive.zonelog495;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/zonelog495")
public class ZoneLog495Controller {
    private final ZoneLog495Service service;
    
    public ZoneLog495Controller(ZoneLog495Service service) { this.service = service; }
    
    @GetMapping
    public List<ZoneLog495> getAll() { return service.findAll(); }
    
    @PostMapping
    public ZoneLog495 create(@RequestBody ZoneLog495 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ZoneLog495";
    }
}
