package com.apinexus.registry.massive.topiclist9873;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/topiclist9873")
public class TopicList9873Controller {
    private final TopicList9873Service service;
    
    public TopicList9873Controller(TopicList9873Service service) { this.service = service; }
    
    @GetMapping
    public List<TopicList9873> getAll() { return service.findAll(); }
    
    @PostMapping
    public TopicList9873 create(@RequestBody TopicList9873 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed TopicList9873";
    }
}
