package com.apinexus.registry.massive.syncgateway3927;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/syncgateway3927")
public class SyncGateway3927Controller {
    private final SyncGateway3927Service service;
    
    public SyncGateway3927Controller(SyncGateway3927Service service) { this.service = service; }
    
    @GetMapping
    public List<SyncGateway3927> getAll() { return service.findAll(); }
    
    @PostMapping
    public SyncGateway3927 create(@RequestBody SyncGateway3927 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SyncGateway3927";
    }
}
