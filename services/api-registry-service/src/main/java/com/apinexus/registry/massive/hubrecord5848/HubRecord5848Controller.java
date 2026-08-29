package com.apinexus.registry.massive.hubrecord5848;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubrecord5848")
public class HubRecord5848Controller {
    private final HubRecord5848Service service;
    
    public HubRecord5848Controller(HubRecord5848Service service) { this.service = service; }
    
    @GetMapping
    public List<HubRecord5848> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubRecord5848 create(@RequestBody HubRecord5848 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubRecord5848";
    }
}
