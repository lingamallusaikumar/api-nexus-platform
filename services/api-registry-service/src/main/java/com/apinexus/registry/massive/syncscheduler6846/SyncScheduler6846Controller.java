package com.apinexus.registry.massive.syncscheduler6846;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/syncscheduler6846")
public class SyncScheduler6846Controller {
    private final SyncScheduler6846Service service;
    
    public SyncScheduler6846Controller(SyncScheduler6846Service service) { this.service = service; }
    
    @GetMapping
    public List<SyncScheduler6846> getAll() { return service.findAll(); }
    
    @PostMapping
    public SyncScheduler6846 create(@RequestBody SyncScheduler6846 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SyncScheduler6846";
    }
}
