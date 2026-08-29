package com.apinexus.registry.massive.eventmanager6686;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/eventmanager6686")
public class EventManager6686Controller {
    private final EventManager6686Service service;
    
    public EventManager6686Controller(EventManager6686Service service) { this.service = service; }
    
    @GetMapping
    public List<EventManager6686> getAll() { return service.findAll(); }
    
    @PostMapping
    public EventManager6686 create(@RequestBody EventManager6686 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EventManager6686";
    }
}
