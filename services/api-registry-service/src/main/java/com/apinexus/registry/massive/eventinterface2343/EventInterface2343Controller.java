package com.apinexus.registry.massive.eventinterface2343;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/eventinterface2343")
public class EventInterface2343Controller {
    private final EventInterface2343Service service;
    
    public EventInterface2343Controller(EventInterface2343Service service) { this.service = service; }
    
    @GetMapping
    public List<EventInterface2343> getAll() { return service.findAll(); }
    
    @PostMapping
    public EventInterface2343 create(@RequestBody EventInterface2343 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EventInterface2343";
    }
}
