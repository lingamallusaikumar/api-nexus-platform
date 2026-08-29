package com.apinexus.registry.massive.syncgraph8009;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/syncgraph8009")
public class SyncGraph8009Controller {
    private final SyncGraph8009Service service;
    
    public SyncGraph8009Controller(SyncGraph8009Service service) { this.service = service; }
    
    @GetMapping
    public List<SyncGraph8009> getAll() { return service.findAll(); }
    
    @PostMapping
    public SyncGraph8009 create(@RequestBody SyncGraph8009 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SyncGraph8009";
    }
}
