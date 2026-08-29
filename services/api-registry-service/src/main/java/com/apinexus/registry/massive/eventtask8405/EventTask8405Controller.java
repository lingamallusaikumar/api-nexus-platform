package com.apinexus.registry.massive.eventtask8405;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/eventtask8405")
public class EventTask8405Controller {
    private final EventTask8405Service service;
    
    public EventTask8405Controller(EventTask8405Service service) { this.service = service; }
    
    @GetMapping
    public List<EventTask8405> getAll() { return service.findAll(); }
    
    @PostMapping
    public EventTask8405 create(@RequestBody EventTask8405 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EventTask8405";
    }
}
