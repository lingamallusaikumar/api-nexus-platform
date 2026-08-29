package com.apinexus.registry.massive.eventsystem8174;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/eventsystem8174")
public class EventSystem8174Controller {
    private final EventSystem8174Service service;
    
    public EventSystem8174Controller(EventSystem8174Service service) { this.service = service; }
    
    @GetMapping
    public List<EventSystem8174> getAll() { return service.findAll(); }
    
    @PostMapping
    public EventSystem8174 create(@RequestBody EventSystem8174 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EventSystem8174";
    }
}
