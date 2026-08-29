package com.apinexus.registry.massive.queuequeue2523;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queuequeue2523")
public class QueueQueue2523Controller {
    private final QueueQueue2523Service service;
    
    public QueueQueue2523Controller(QueueQueue2523Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueQueue2523> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueQueue2523 create(@RequestBody QueueQueue2523 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueQueue2523";
    }
}
