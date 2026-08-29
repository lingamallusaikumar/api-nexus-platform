package com.apinexus.registry.massive.syncthread2776;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/syncthread2776")
public class SyncThread2776Controller {
    private final SyncThread2776Service service;
    
    public SyncThread2776Controller(SyncThread2776Service service) { this.service = service; }
    
    @GetMapping
    public List<SyncThread2776> getAll() { return service.findAll(); }
    
    @PostMapping
    public SyncThread2776 create(@RequestBody SyncThread2776 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SyncThread2776";
    }
}
