package com.apinexus.registry.massive.realtimecache1225;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimecache1225")
public class RealtimeCache1225Controller {
    private final RealtimeCache1225Service service;
    
    public RealtimeCache1225Controller(RealtimeCache1225Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeCache1225> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeCache1225 create(@RequestBody RealtimeCache1225 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeCache1225";
    }
}
