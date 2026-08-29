package com.apinexus.registry.massive.queuestore2383;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/queuestore2383")
public class QueueStore2383Controller {
    private final QueueStore2383Service service;
    
    public QueueStore2383Controller(QueueStore2383Service service) { this.service = service; }
    
    @GetMapping
    public List<QueueStore2383> getAll() { return service.findAll(); }
    
    @PostMapping
    public QueueStore2383 create(@RequestBody QueueStore2383 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed QueueStore2383";
    }
}
