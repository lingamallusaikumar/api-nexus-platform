package com.apinexus.registry.massive.eventadapter4724;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/eventadapter4724")
public class EventAdapter4724Controller {
    private final EventAdapter4724Service service;
    
    public EventAdapter4724Controller(EventAdapter4724Service service) { this.service = service; }
    
    @GetMapping
    public List<EventAdapter4724> getAll() { return service.findAll(); }
    
    @PostMapping
    public EventAdapter4724 create(@RequestBody EventAdapter4724 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EventAdapter4724";
    }
}
