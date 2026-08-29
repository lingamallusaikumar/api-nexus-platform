package com.apinexus.registry.massive.topicmanager1936;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/topicmanager1936")
public class TopicManager1936Controller {
    private final TopicManager1936Service service;
    
    public TopicManager1936Controller(TopicManager1936Service service) { this.service = service; }
    
    @GetMapping
    public List<TopicManager1936> getAll() { return service.findAll(); }
    
    @PostMapping
    public TopicManager1936 create(@RequestBody TopicManager1936 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed TopicManager1936";
    }
}
