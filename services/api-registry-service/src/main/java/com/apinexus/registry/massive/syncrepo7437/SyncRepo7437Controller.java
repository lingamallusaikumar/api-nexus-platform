package com.apinexus.registry.massive.syncrepo7437;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/syncrepo7437")
public class SyncRepo7437Controller {
    private final SyncRepo7437Service service;
    
    public SyncRepo7437Controller(SyncRepo7437Service service) { this.service = service; }
    
    @GetMapping
    public List<SyncRepo7437> getAll() { return service.findAll(); }
    
    @PostMapping
    public SyncRepo7437 create(@RequestBody SyncRepo7437 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SyncRepo7437";
    }
}
