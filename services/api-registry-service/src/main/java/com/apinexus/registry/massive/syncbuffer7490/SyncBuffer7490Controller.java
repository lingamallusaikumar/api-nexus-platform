package com.apinexus.registry.massive.syncbuffer7490;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/syncbuffer7490")
public class SyncBuffer7490Controller {
    private final SyncBuffer7490Service service;
    
    public SyncBuffer7490Controller(SyncBuffer7490Service service) { this.service = service; }
    
    @GetMapping
    public List<SyncBuffer7490> getAll() { return service.findAll(); }
    
    @PostMapping
    public SyncBuffer7490 create(@RequestBody SyncBuffer7490 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SyncBuffer7490";
    }
}
