package com.apinexus.registry.massive.eventedge8155;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/eventedge8155")
public class EventEdge8155Controller {
    private final EventEdge8155Service service;
    
    public EventEdge8155Controller(EventEdge8155Service service) { this.service = service; }
    
    @GetMapping
    public List<EventEdge8155> getAll() { return service.findAll(); }
    
    @PostMapping
    public EventEdge8155 create(@RequestBody EventEdge8155 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EventEdge8155";
    }
}
