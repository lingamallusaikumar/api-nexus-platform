package com.apinexus.registry.massive.realtimethread9378;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimethread9378")
public class RealtimeThread9378Controller {
    private final RealtimeThread9378Service service;
    
    public RealtimeThread9378Controller(RealtimeThread9378Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeThread9378> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeThread9378 create(@RequestBody RealtimeThread9378 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeThread9378";
    }
}
