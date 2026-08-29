package com.apinexus.registry.massive.synclog2567;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/synclog2567")
public class SyncLog2567Controller {
    private final SyncLog2567Service service;
    
    public SyncLog2567Controller(SyncLog2567Service service) { this.service = service; }
    
    @GetMapping
    public List<SyncLog2567> getAll() { return service.findAll(); }
    
    @PostMapping
    public SyncLog2567 create(@RequestBody SyncLog2567 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SyncLog2567";
    }
}
