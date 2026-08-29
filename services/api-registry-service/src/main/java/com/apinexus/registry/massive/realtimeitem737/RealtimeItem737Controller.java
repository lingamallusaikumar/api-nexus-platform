package com.apinexus.registry.massive.realtimeitem737;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimeitem737")
public class RealtimeItem737Controller {
    private final RealtimeItem737Service service;
    
    public RealtimeItem737Controller(RealtimeItem737Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeItem737> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeItem737 create(@RequestBody RealtimeItem737 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeItem737";
    }
}
