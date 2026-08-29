package com.apinexus.registry.massive.queuequeue6486;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queuequeue6486")
public class QueueQueue6486Controller {
    private final QueueQueue6486Service service;
    
    public QueueQueue6486Controller(QueueQueue6486Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueQueue6486> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueQueue6486 create(@RequestBody QueueQueue6486 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueQueue6486";
    }
}
