package com.apinexus.registry.massive.realtimescheduler3007;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimescheduler3007")
public class RealtimeScheduler3007Controller {
    private final RealtimeScheduler3007Service service;
    
    public RealtimeScheduler3007Controller(RealtimeScheduler3007Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeScheduler3007> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeScheduler3007 create(@RequestBody RealtimeScheduler3007 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeScheduler3007";
    }
}
