package com.apinexus.registry.massive.zonegraph5960;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/zonegraph5960")
public class ZoneGraph5960Controller {
    private final ZoneGraph5960Service service;
    
    public ZoneGraph5960Controller(ZoneGraph5960Service service) { this.service = service; }
    
    @GetMapping
    public List<ZoneGraph5960> getAll() { return service.findAll(); }
    
    @PostMapping
    public ZoneGraph5960 create(@RequestBody ZoneGraph5960 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ZoneGraph5960";
    }
}
