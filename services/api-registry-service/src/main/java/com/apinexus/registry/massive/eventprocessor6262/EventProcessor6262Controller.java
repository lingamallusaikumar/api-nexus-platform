package com.apinexus.registry.massive.eventprocessor6262;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/eventprocessor6262")
public class EventProcessor6262Controller {
    private final EventProcessor6262Service service;
    
    public EventProcessor6262Controller(EventProcessor6262Service service) { this.service = service; }
    
    @GetMapping
    public List<EventProcessor6262> getAll() { return service.findAll(); }
    
    @PostMapping
    public EventProcessor6262 create(@RequestBody EventProcessor6262 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EventProcessor6262";
    }
}
