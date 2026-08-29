package com.apinexus.registry.massive.syncportal1683;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/syncportal1683")
public class SyncPortal1683Controller {
    private final SyncPortal1683Service service;
    
    public SyncPortal1683Controller(SyncPortal1683Service service) { this.service = service; }
    
    @GetMapping
    public List<SyncPortal1683> getAll() { return service.findAll(); }
    
    @PostMapping
    public SyncPortal1683 create(@RequestBody SyncPortal1683 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SyncPortal1683";
    }
}
