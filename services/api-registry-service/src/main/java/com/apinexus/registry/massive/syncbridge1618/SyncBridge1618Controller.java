package com.apinexus.registry.massive.syncbridge1618;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/syncbridge1618")
public class SyncBridge1618Controller {
    private final SyncBridge1618Service service;
    
    public SyncBridge1618Controller(SyncBridge1618Service service) { this.service = service; }
    
    @GetMapping
    public List<SyncBridge1618> getAll() { return service.findAll(); }
    
    @PostMapping
    public SyncBridge1618 create(@RequestBody SyncBridge1618 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SyncBridge1618";
    }
}
