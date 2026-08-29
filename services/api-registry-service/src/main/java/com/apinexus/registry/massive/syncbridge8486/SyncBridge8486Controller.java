package com.apinexus.registry.massive.syncbridge8486;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/syncbridge8486")
public class SyncBridge8486Controller {
    private final SyncBridge8486Service service;
    
    public SyncBridge8486Controller(SyncBridge8486Service service) { this.service = service; }
    
    @GetMapping
    public List<SyncBridge8486> getAll() { return service.findAll(); }
    
    @PostMapping
    public SyncBridge8486 create(@RequestBody SyncBridge8486 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SyncBridge8486";
    }
}
