package com.apinexus.registry.massive.eventvertex2885;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/eventvertex2885")
public class EventVertex2885Controller {
    private final EventVertex2885Service service;
    
    public EventVertex2885Controller(EventVertex2885Service service) { this.service = service; }
    
    @GetMapping
    public List<EventVertex2885> getAll() { return service.findAll(); }
    
    @PostMapping
    public EventVertex2885 create(@RequestBody EventVertex2885 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EventVertex2885";
    }
}
