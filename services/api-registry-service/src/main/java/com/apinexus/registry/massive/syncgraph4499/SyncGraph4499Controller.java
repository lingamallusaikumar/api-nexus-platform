package com.apinexus.registry.massive.syncgraph4499;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/syncgraph4499")
public class SyncGraph4499Controller {
    private final SyncGraph4499Service service;
    
    public SyncGraph4499Controller(SyncGraph4499Service service) { this.service = service; }
    
    @GetMapping
    public List<SyncGraph4499> getAll() { return service.findAll(); }
    
    @PostMapping
    public SyncGraph4499 create(@RequestBody SyncGraph4499 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SyncGraph4499";
    }
}
