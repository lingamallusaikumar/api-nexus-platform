package com.apinexus.registry.massive.syncnode3319;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/syncnode3319")
public class SyncNode3319Controller {
    private final SyncNode3319Service service;
    
    public SyncNode3319Controller(SyncNode3319Service service) { this.service = service; }
    
    @GetMapping
    public List<SyncNode3319> getAll() { return service.findAll(); }
    
    @PostMapping
    public SyncNode3319 create(@RequestBody SyncNode3319 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SyncNode3319";
    }
}
