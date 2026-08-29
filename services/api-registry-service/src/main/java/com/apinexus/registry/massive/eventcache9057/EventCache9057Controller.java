package com.apinexus.registry.massive.eventcache9057;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/eventcache9057")
public class EventCache9057Controller {
    private final EventCache9057Service service;
    
    public EventCache9057Controller(EventCache9057Service service) { this.service = service; }
    
    @GetMapping
    public List<EventCache9057> getAll() { return service.findAll(); }
    
    @PostMapping
    public EventCache9057 create(@RequestBody EventCache9057 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EventCache9057";
    }
}
