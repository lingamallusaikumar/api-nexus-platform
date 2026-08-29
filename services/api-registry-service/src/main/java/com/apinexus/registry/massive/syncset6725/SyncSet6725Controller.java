package com.apinexus.registry.massive.syncset6725;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/syncset6725")
public class SyncSet6725Controller {
    private final SyncSet6725Service service;
    
    public SyncSet6725Controller(SyncSet6725Service service) { this.service = service; }
    
    @GetMapping
    public List<SyncSet6725> getAll() { return service.findAll(); }
    
    @PostMapping
    public SyncSet6725 create(@RequestBody SyncSet6725 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SyncSet6725";
    }
}
