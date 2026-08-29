package com.apinexus.registry.massive.topicworker7970;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/topicworker7970")
public class TopicWorker7970Controller {
    private final TopicWorker7970Service service;
    
    public TopicWorker7970Controller(TopicWorker7970Service service) { this.service = service; }
    
    @GetMapping
    public List<TopicWorker7970> getAll() { return service.findAll(); }
    
    @PostMapping
    public TopicWorker7970 create(@RequestBody TopicWorker7970 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed TopicWorker7970";
    }
}
