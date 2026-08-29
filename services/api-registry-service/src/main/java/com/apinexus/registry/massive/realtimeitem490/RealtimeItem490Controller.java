package com.apinexus.registry.massive.realtimeitem490;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimeitem490")
public class RealtimeItem490Controller {
    private final RealtimeItem490Service service;
    
    public RealtimeItem490Controller(RealtimeItem490Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeItem490> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeItem490 create(@RequestBody RealtimeItem490 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeItem490";
    }
}
