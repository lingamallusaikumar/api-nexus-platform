package com.apinexus.registry.massive.queueprocess372;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queueprocess372")
public class QueueProcess372Controller {
    private final QueueProcess372Service service;
    
    public QueueProcess372Controller(QueueProcess372Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueProcess372> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueProcess372 create(@RequestBody QueueProcess372 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueProcess372";
    }
}
