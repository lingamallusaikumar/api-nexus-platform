package com.apinexus.registry.massive.queueitem9266;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queueitem9266")
public class QueueItem9266Controller {
    private final QueueItem9266Service service;
    
    public QueueItem9266Controller(QueueItem9266Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueItem9266> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueItem9266 create(@RequestBody QueueItem9266 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueItem9266";
    }
}
