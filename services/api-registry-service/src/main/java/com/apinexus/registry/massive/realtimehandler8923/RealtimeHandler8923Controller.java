package com.apinexus.registry.massive.realtimehandler8923;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimehandler8923")
public class RealtimeHandler8923Controller {
    private final RealtimeHandler8923Service service;
    
    public RealtimeHandler8923Controller(RealtimeHandler8923Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeHandler8923> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeHandler8923 create(@RequestBody RealtimeHandler8923 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeHandler8923";
    }
}
