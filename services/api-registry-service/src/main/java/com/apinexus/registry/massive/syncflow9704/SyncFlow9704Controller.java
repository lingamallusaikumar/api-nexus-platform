package com.apinexus.registry.massive.syncflow9704;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/syncflow9704")
public class SyncFlow9704Controller {
    private final SyncFlow9704Service service;
    
    public SyncFlow9704Controller(SyncFlow9704Service service) { this.service = service; }
    
    @GetMapping
    public List<SyncFlow9704> getAll() { return service.findAll(); }
    
    @PostMapping
    public SyncFlow9704 create(@RequestBody SyncFlow9704 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SyncFlow9704";
    }
}
