package com.apinexus.registry.massive.realtimeworker2746;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimeworker2746")
public class RealtimeWorker2746Controller {
    private final RealtimeWorker2746Service service;
    
    public RealtimeWorker2746Controller(RealtimeWorker2746Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeWorker2746> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeWorker2746 create(@RequestBody RealtimeWorker2746 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeWorker2746";
    }
}
