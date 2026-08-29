package com.apinexus.registry.massive.zonecache6527;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/zonecache6527")
public class ZoneCache6527Controller {
    private final ZoneCache6527Service service;
    
    public ZoneCache6527Controller(ZoneCache6527Service service) { this.service = service; }
    
    @GetMapping
    public List<ZoneCache6527> getAll() { return service.findAll(); }
    
    @PostMapping
    public ZoneCache6527 create(@RequestBody ZoneCache6527 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ZoneCache6527";
    }
}
