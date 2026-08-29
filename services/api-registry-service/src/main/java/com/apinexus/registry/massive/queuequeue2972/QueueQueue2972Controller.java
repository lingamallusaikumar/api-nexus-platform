package com.apinexus.registry.massive.queuequeue2972;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queuequeue2972")
public class QueueQueue2972Controller {
    private final QueueQueue2972Service service;
    
    public QueueQueue2972Controller(QueueQueue2972Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueQueue2972> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueQueue2972 create(@RequestBody QueueQueue2972 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueQueue2972";
    }
}
