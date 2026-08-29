package com.apinexus.registry.massive.eventjob9064;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/eventjob9064")
public class EventJob9064Controller {
    private final EventJob9064Service service;
    
    public EventJob9064Controller(EventJob9064Service service) { this.service = service; }
    
    @GetMapping
    public List<EventJob9064> getAll() { return service.findAll(); }
    
    @PostMapping
    public EventJob9064 create(@RequestBody EventJob9064 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EventJob9064";
    }
}
