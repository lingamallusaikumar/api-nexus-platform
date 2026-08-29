package com.apinexus.registry.massive.realtimerepo3395;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimerepo3395")
public class RealtimeRepo3395Controller {
    private final RealtimeRepo3395Service service;
    
    public RealtimeRepo3395Controller(RealtimeRepo3395Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeRepo3395> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeRepo3395 create(@RequestBody RealtimeRepo3395 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeRepo3395";
    }
}
