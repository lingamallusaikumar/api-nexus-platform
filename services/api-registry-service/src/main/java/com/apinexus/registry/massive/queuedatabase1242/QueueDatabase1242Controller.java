package com.apinexus.registry.massive.queuedatabase1242;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queuedatabase1242")
public class QueueDatabase1242Controller {
    private final QueueDatabase1242Service service;
    
    public QueueDatabase1242Controller(QueueDatabase1242Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueDatabase1242> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueDatabase1242 create(@RequestBody QueueDatabase1242 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueDatabase1242";
    }
}
