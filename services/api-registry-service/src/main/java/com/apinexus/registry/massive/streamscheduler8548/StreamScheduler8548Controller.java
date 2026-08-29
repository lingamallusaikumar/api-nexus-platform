package com.apinexus.registry.massive.streamscheduler8548;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streamscheduler8548")
public class StreamScheduler8548Controller {
    private final StreamScheduler8548Service service;
    
    public StreamScheduler8548Controller(StreamScheduler8548Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamScheduler8548> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamScheduler8548 create(@RequestBody StreamScheduler8548 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamScheduler8548";
    }
}
