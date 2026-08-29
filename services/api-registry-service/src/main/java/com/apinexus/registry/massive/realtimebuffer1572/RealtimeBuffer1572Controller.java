package com.apinexus.registry.massive.realtimebuffer1572;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimebuffer1572")
public class RealtimeBuffer1572Controller {
    private final RealtimeBuffer1572Service service;
    
    public RealtimeBuffer1572Controller(RealtimeBuffer1572Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeBuffer1572> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeBuffer1572 create(@RequestBody RealtimeBuffer1572 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeBuffer1572";
    }
}
