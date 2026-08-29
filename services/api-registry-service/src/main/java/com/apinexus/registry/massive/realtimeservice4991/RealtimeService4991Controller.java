package com.apinexus.registry.massive.realtimeservice4991;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimeservice4991")
public class RealtimeService4991Controller {
    private final RealtimeService4991Service service;
    
    public RealtimeService4991Controller(RealtimeService4991Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeService4991> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeService4991 create(@RequestBody RealtimeService4991 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeService4991";
    }
}
