package com.apinexus.registry.massive.topicmap5150;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/topicmap5150")
public class TopicMap5150Controller {
    private final TopicMap5150Service service;
    
    public TopicMap5150Controller(TopicMap5150Service service) { this.service = service; }
    
    @GetMapping
    public List<TopicMap5150> getAll() { return service.findAll(); }
    
    @PostMapping
    public TopicMap5150 create(@RequestBody TopicMap5150 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed TopicMap5150";
    }
}
