package com.apinexus.registry.massive.eventhandler5827;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/eventhandler5827")
public class EventHandler5827Controller {
    private final EventHandler5827Service service;
    
    public EventHandler5827Controller(EventHandler5827Service service) { this.service = service; }
    
    @GetMapping
    public List<EventHandler5827> getAll() { return service.findAll(); }
    
    @PostMapping
    public EventHandler5827 create(@RequestBody EventHandler5827 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EventHandler5827";
    }
}
