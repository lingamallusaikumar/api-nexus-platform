package com.apinexus.registry.massive.queuerecord9500;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queuerecord9500")
public class QueueRecord9500Controller {
    private final QueueRecord9500Service service;
    
    public QueueRecord9500Controller(QueueRecord9500Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueRecord9500> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueRecord9500 create(@RequestBody QueueRecord9500 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueRecord9500";
    }
}
