package com.apinexus.registry.massive.queuecomponent1004;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queuecomponent1004")
public class QueueComponent1004Controller {
    private final QueueComponent1004Service service;
    
    public QueueComponent1004Controller(QueueComponent1004Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueComponent1004> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueComponent1004 create(@RequestBody QueueComponent1004 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueComponent1004";
    }
}
