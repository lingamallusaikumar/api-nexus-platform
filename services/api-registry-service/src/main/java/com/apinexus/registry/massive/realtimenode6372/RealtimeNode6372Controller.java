package com.apinexus.registry.massive.realtimenode6372;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimenode6372")
public class RealtimeNode6372Controller {
    private final RealtimeNode6372Service service;
    
    public RealtimeNode6372Controller(RealtimeNode6372Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeNode6372> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeNode6372 create(@RequestBody RealtimeNode6372 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeNode6372";
    }
}
