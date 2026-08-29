package com.apinexus.registry.massive.streamscheduler4791;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streamscheduler4791")
public class StreamScheduler4791Controller {
    private final StreamScheduler4791Service service;
    
    public StreamScheduler4791Controller(StreamScheduler4791Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamScheduler4791> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamScheduler4791 create(@RequestBody StreamScheduler4791 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamScheduler4791";
    }
}
