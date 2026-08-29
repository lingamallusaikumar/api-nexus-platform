package com.apinexus.registry.massive.syncgateway8179;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/syncgateway8179")
public class SyncGateway8179Controller {
    private final SyncGateway8179Service service;
    
    public SyncGateway8179Controller(SyncGateway8179Service service) { this.service = service; }
    
    @GetMapping
    public List<SyncGateway8179> getAll() { return service.findAll(); }
    
    @PostMapping
    public SyncGateway8179 create(@RequestBody SyncGateway8179 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SyncGateway8179";
    }
}
