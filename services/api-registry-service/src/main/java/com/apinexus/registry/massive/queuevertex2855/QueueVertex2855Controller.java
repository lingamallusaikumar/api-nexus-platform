package com.apinexus.registry.massive.queuevertex2855;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queuevertex2855")
public class QueueVertex2855Controller {
    private final QueueVertex2855Service service;
    
    public QueueVertex2855Controller(QueueVertex2855Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueVertex2855> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueVertex2855 create(@RequestBody QueueVertex2855 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueVertex2855";
    }
}
