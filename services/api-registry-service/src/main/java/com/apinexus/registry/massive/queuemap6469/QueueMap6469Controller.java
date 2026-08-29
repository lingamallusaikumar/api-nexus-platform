package com.apinexus.registry.massive.queuemap6469;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queuemap6469")
public class QueueMap6469Controller {
    private final QueueMap6469Service service;
    
    public QueueMap6469Controller(QueueMap6469Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueMap6469> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueMap6469 create(@RequestBody QueueMap6469 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueMap6469";
    }
}
