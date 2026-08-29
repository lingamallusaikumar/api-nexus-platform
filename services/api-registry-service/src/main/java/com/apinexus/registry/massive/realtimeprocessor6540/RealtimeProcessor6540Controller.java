package com.apinexus.registry.massive.realtimeprocessor6540;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimeprocessor6540")
public class RealtimeProcessor6540Controller {
    private final RealtimeProcessor6540Service service;
    
    public RealtimeProcessor6540Controller(RealtimeProcessor6540Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeProcessor6540> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeProcessor6540 create(@RequestBody RealtimeProcessor6540 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeProcessor6540";
    }
}
