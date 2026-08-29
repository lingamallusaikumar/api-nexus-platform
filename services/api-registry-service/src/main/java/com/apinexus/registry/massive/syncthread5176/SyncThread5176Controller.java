package com.apinexus.registry.massive.syncthread5176;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/syncthread5176")
public class SyncThread5176Controller {
    private final SyncThread5176Service service;
    
    public SyncThread5176Controller(SyncThread5176Service service) { this.service = service; }
    
    @GetMapping
    public List<SyncThread5176> getAll() { return service.findAll(); }
    
    @PostMapping
    public SyncThread5176 create(@RequestBody SyncThread5176 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SyncThread5176";
    }
}
