package com.apinexus.registry.massive.queuerecord8429;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queuerecord8429")
public class QueueRecord8429Controller {
    private final QueueRecord8429Service service;
    
    public QueueRecord8429Controller(QueueRecord8429Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueRecord8429> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueRecord8429 create(@RequestBody QueueRecord8429 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueRecord8429";
    }
}
