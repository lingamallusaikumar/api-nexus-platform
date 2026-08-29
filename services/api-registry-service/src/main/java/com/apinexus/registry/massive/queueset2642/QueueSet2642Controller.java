package com.apinexus.registry.massive.queueset2642;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queueset2642")
public class QueueSet2642Controller {
    private final QueueSet2642Service service;
    
    public QueueSet2642Controller(QueueSet2642Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueSet2642> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueSet2642 create(@RequestBody QueueSet2642 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueSet2642";
    }
}
