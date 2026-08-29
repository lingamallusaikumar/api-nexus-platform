package com.apinexus.registry.massive.syncset4582;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/syncset4582")
public class SyncSet4582Controller {
    private final SyncSet4582Service service;
    
    public SyncSet4582Controller(SyncSet4582Service service) { this.service = service; }
    
    @GetMapping
    public List<SyncSet4582> getAll() { return service.findAll(); }
    
    @PostMapping
    public SyncSet4582 create(@RequestBody SyncSet4582 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SyncSet4582";
    }
}
