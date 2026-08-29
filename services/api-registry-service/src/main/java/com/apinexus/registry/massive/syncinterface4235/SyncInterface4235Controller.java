package com.apinexus.registry.massive.syncinterface4235;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/syncinterface4235")
public class SyncInterface4235Controller {
    private final SyncInterface4235Service service;
    
    public SyncInterface4235Controller(SyncInterface4235Service service) { this.service = service; }
    
    @GetMapping
    public List<SyncInterface4235> getAll() { return service.findAll(); }
    
    @PostMapping
    public SyncInterface4235 create(@RequestBody SyncInterface4235 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SyncInterface4235";
    }
}
