package com.apinexus.registry.massive.topicstore8384;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/topicstore8384")
public class TopicStore8384Controller {
    private final TopicStore8384Service service;
    
    public TopicStore8384Controller(TopicStore8384Service service) { this.service = service; }
    
    @GetMapping
    public List<TopicStore8384> getAll() { return service.findAll(); }
    
    @PostMapping
    public TopicStore8384 create(@RequestBody TopicStore8384 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed TopicStore8384";
    }
}
