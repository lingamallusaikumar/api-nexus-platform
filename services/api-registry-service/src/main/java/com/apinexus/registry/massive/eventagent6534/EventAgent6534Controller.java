package com.apinexus.registry.massive.eventagent6534;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/eventagent6534")
public class EventAgent6534Controller {
    private final EventAgent6534Service service;
    
    public EventAgent6534Controller(EventAgent6534Service service) { this.service = service; }
    
    @GetMapping
    public List<EventAgent6534> getAll() { return service.findAll(); }
    
    @PostMapping
    public EventAgent6534 create(@RequestBody EventAgent6534 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EventAgent6534";
    }
}
