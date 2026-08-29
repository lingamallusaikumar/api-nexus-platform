package com.apinexus.registry.massive.realtimeset8651;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimeset8651")
public class RealtimeSet8651Controller {
    private final RealtimeSet8651Service service;
    
    public RealtimeSet8651Controller(RealtimeSet8651Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeSet8651> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeSet8651 create(@RequestBody RealtimeSet8651 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeSet8651";
    }
}
