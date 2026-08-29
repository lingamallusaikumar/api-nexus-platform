package com.apinexus.registry.massive.digitalscheduler6572;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalscheduler6572")
public class DigitalScheduler6572Controller {
    private final DigitalScheduler6572Service service;
    
    public DigitalScheduler6572Controller(DigitalScheduler6572Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalScheduler6572> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalScheduler6572 create(@RequestBody DigitalScheduler6572 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalScheduler6572";
    }
}
