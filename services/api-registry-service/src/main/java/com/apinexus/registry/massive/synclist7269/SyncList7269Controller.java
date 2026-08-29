package com.apinexus.registry.massive.synclist7269;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/synclist7269")
public class SyncList7269Controller {
    private final SyncList7269Service service;
    
    public SyncList7269Controller(SyncList7269Service service) { this.service = service; }
    
    @GetMapping
    public List<SyncList7269> getAll() { return service.findAll(); }
    
    @PostMapping
    public SyncList7269 create(@RequestBody SyncList7269 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SyncList7269";
    }
}
