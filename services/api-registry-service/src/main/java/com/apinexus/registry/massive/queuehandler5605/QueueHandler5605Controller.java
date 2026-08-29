package com.apinexus.registry.massive.queuehandler5605;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queuehandler5605")
public class QueueHandler5605Controller {
    private final QueueHandler5605Service service;
    
    public QueueHandler5605Controller(QueueHandler5605Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueHandler5605> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueHandler5605 create(@RequestBody QueueHandler5605 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueHandler5605";
    }
}
