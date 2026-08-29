package com.apinexus.registry.massive.realtimequeue4770;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimequeue4770")
public class RealtimeQueue4770Controller {
    private final RealtimeQueue4770Service service;
    
    public RealtimeQueue4770Controller(RealtimeQueue4770Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeQueue4770> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeQueue4770 create(@RequestBody RealtimeQueue4770 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeQueue4770";
    }
}
