package com.apinexus.registry.massive.eventroute7753;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/eventroute7753")
public class EventRoute7753Controller {
    private final EventRoute7753Service service;
    
    public EventRoute7753Controller(EventRoute7753Service service) { this.service = service; }
    
    @GetMapping
    public List<EventRoute7753> getAll() { return service.findAll(); }
    
    @PostMapping
    public EventRoute7753 create(@RequestBody EventRoute7753 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EventRoute7753";
    }
}
