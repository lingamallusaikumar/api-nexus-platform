package com.apinexus.registry.massive.queuestack7231;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queuestack7231")
public class QueueStack7231Controller {
    private final QueueStack7231Service service;
    
    public QueueStack7231Controller(QueueStack7231Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueStack7231> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueStack7231 create(@RequestBody QueueStack7231 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueStack7231";
    }
}
