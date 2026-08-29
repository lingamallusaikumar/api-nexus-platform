package com.apinexus.registry.massive.realtimequeue2226;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimequeue2226")
public class RealtimeQueue2226Controller {
    private final RealtimeQueue2226Service service;
    
    public RealtimeQueue2226Controller(RealtimeQueue2226Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeQueue2226> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeQueue2226 create(@RequestBody RealtimeQueue2226 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeQueue2226";
    }
}
