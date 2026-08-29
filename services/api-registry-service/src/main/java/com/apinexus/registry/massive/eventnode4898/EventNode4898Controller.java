package com.apinexus.registry.massive.eventnode4898;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/eventnode4898")
public class EventNode4898Controller {
    private final EventNode4898Service service;
    
    public EventNode4898Controller(EventNode4898Service service) { this.service = service; }
    
    @GetMapping
    public List<EventNode4898> getAll() { return service.findAll(); }
    
    @PostMapping
    public EventNode4898 create(@RequestBody EventNode4898 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EventNode4898";
    }
}
