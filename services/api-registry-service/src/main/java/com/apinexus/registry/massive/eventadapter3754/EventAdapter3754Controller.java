package com.apinexus.registry.massive.eventadapter3754;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/eventadapter3754")
public class EventAdapter3754Controller {
    private final EventAdapter3754Service service;
    
    public EventAdapter3754Controller(EventAdapter3754Service service) { this.service = service; }
    
    @GetMapping
    public List<EventAdapter3754> getAll() { return service.findAll(); }
    
    @PostMapping
    public EventAdapter3754 create(@RequestBody EventAdapter3754 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EventAdapter3754";
    }
}
