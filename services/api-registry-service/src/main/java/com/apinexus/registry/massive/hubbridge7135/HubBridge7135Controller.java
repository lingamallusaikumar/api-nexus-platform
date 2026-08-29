package com.apinexus.registry.massive.hubbridge7135;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubbridge7135")
public class HubBridge7135Controller {
    private final HubBridge7135Service service;
    
    public HubBridge7135Controller(HubBridge7135Service service) { this.service = service; }
    
    @GetMapping
    public List<HubBridge7135> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubBridge7135 create(@RequestBody HubBridge7135 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubBridge7135";
    }
}
