package com.apinexus.registry.massive.queuemap703;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queuemap703")
public class QueueMap703Controller {
    private final QueueMap703Service service;
    
    public QueueMap703Controller(QueueMap703Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueMap703> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueMap703 create(@RequestBody QueueMap703 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueMap703";
    }
}
