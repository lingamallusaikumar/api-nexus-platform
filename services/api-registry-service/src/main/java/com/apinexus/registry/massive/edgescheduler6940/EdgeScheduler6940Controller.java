package com.apinexus.registry.massive.edgescheduler6940;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgescheduler6940")
public class EdgeScheduler6940Controller {
    private final EdgeScheduler6940Service service;
    
    public EdgeScheduler6940Controller(EdgeScheduler6940Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeScheduler6940> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeScheduler6940 create(@RequestBody EdgeScheduler6940 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeScheduler6940";
    }
}
