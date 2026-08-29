package com.apinexus.registry.massive.eventarray8323;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/eventarray8323")
public class EventArray8323Controller {
    private final EventArray8323Service service;
    
    public EventArray8323Controller(EventArray8323Service service) { this.service = service; }
    
    @GetMapping
    public List<EventArray8323> getAll() { return service.findAll(); }
    
    @PostMapping
    public EventArray8323 create(@RequestBody EventArray8323 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EventArray8323";
    }
}
