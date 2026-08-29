package com.apinexus.registry.massive.realtimethread1137;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimethread1137")
public class RealtimeThread1137Controller {
    private final RealtimeThread1137Service service;
    
    public RealtimeThread1137Controller(RealtimeThread1137Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeThread1137> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeThread1137 create(@RequestBody RealtimeThread1137 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeThread1137";
    }
}
