package com.apinexus.registry.massive.realtimescheduler1285;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimescheduler1285")
public class RealtimeScheduler1285Controller {
    private final RealtimeScheduler1285Service service;
    
    public RealtimeScheduler1285Controller(RealtimeScheduler1285Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeScheduler1285> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeScheduler1285 create(@RequestBody RealtimeScheduler1285 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeScheduler1285";
    }
}
