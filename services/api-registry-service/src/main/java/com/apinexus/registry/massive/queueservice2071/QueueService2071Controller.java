package com.apinexus.registry.massive.queueservice2071;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queueservice2071")
public class QueueService2071Controller {
    private final QueueService2071Service service;
    
    public QueueService2071Controller(QueueService2071Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueService2071> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueService2071 create(@RequestBody QueueService2071 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueService2071";
    }
}
