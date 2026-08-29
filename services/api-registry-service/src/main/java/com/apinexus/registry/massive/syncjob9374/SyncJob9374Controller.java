package com.apinexus.registry.massive.syncjob9374;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/syncjob9374")
public class SyncJob9374Controller {
    private final SyncJob9374Service service;
    
    public SyncJob9374Controller(SyncJob9374Service service) { this.service = service; }
    
    @GetMapping
    public List<SyncJob9374> getAll() { return service.findAll(); }
    
    @PostMapping
    public SyncJob9374 create(@RequestBody SyncJob9374 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SyncJob9374";
    }
}
