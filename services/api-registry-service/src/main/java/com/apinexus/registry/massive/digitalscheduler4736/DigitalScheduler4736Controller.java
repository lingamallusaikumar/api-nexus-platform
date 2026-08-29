package com.apinexus.registry.massive.digitalscheduler4736;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalscheduler4736")
public class DigitalScheduler4736Controller {
    private final DigitalScheduler4736Service service;
    
    public DigitalScheduler4736Controller(DigitalScheduler4736Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalScheduler4736> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalScheduler4736 create(@RequestBody DigitalScheduler4736 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalScheduler4736";
    }
}
