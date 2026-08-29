package com.apinexus.registry.massive.queuebridge9357;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queuebridge9357")
public class QueueBridge9357Controller {
    private final QueueBridge9357Service service;
    
    public QueueBridge9357Controller(QueueBridge9357Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueBridge9357> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueBridge9357 create(@RequestBody QueueBridge9357 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueBridge9357";
    }
}
