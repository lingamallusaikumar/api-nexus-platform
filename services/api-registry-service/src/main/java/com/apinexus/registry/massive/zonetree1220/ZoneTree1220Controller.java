package com.apinexus.registry.massive.zonetree1220;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/zonetree1220")
public class ZoneTree1220Controller {
    private final ZoneTree1220Service service;
    
    public ZoneTree1220Controller(ZoneTree1220Service service) { this.service = service; }
    
    @GetMapping
    public List<ZoneTree1220> getAll() { return service.findAll(); }
    
    @PostMapping
    public ZoneTree1220 create(@RequestBody ZoneTree1220 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ZoneTree1220";
    }
}
