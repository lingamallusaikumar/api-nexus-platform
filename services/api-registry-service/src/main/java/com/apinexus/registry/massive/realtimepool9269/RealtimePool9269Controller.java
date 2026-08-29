package com.apinexus.registry.massive.realtimepool9269;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimepool9269")
public class RealtimePool9269Controller {
    private final RealtimePool9269Service service;
    
    public RealtimePool9269Controller(RealtimePool9269Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimePool9269> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimePool9269 create(@RequestBody RealtimePool9269 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimePool9269";
    }
}
