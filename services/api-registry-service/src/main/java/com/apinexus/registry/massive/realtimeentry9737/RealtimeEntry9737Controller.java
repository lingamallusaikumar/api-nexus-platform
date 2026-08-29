package com.apinexus.registry.massive.realtimeentry9737;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimeentry9737")
public class RealtimeEntry9737Controller {
    private final RealtimeEntry9737Service service;
    
    public RealtimeEntry9737Controller(RealtimeEntry9737Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeEntry9737> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeEntry9737 create(@RequestBody RealtimeEntry9737 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeEntry9737";
    }
}
