package com.apinexus.registry.massive.eventbridge4406;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/eventbridge4406")
public class EventBridge4406Controller {
    private final EventBridge4406Service service;
    
    public EventBridge4406Controller(EventBridge4406Service service) { this.service = service; }
    
    @GetMapping
    public List<EventBridge4406> getAll() { return service.findAll(); }
    
    @PostMapping
    public EventBridge4406 create(@RequestBody EventBridge4406 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EventBridge4406";
    }
}
