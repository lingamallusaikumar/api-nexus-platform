package com.apinexus.registry.massive.realtimelog7480;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimelog7480")
public class RealtimeLog7480Controller {
    private final RealtimeLog7480Service service;
    
    public RealtimeLog7480Controller(RealtimeLog7480Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeLog7480> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeLog7480 create(@RequestBody RealtimeLog7480 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeLog7480";
    }
}
