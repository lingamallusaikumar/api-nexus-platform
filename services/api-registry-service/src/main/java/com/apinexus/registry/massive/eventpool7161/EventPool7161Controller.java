package com.apinexus.registry.massive.eventpool7161;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/eventpool7161")
public class EventPool7161Controller {
    private final EventPool7161Service service;
    
    public EventPool7161Controller(EventPool7161Service service) { this.service = service; }
    
    @GetMapping
    public List<EventPool7161> getAll() { return service.findAll(); }
    
    @PostMapping
    public EventPool7161 create(@RequestBody EventPool7161 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EventPool7161";
    }
}
