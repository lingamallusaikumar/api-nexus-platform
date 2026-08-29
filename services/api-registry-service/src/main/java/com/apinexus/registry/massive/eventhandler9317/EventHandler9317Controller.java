package com.apinexus.registry.massive.eventhandler9317;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/eventhandler9317")
public class EventHandler9317Controller {
    private final EventHandler9317Service service;
    
    public EventHandler9317Controller(EventHandler9317Service service) { this.service = service; }
    
    @GetMapping
    public List<EventHandler9317> getAll() { return service.findAll(); }
    
    @PostMapping
    public EventHandler9317 create(@RequestBody EventHandler9317 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EventHandler9317";
    }
}
