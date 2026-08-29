package com.apinexus.registry.massive.topicbridge1982;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/topicbridge1982")
public class TopicBridge1982Controller {
    private final TopicBridge1982Service service;
    
    public TopicBridge1982Controller(TopicBridge1982Service service) { this.service = service; }
    
    @GetMapping
    public List<TopicBridge1982> getAll() { return service.findAll(); }
    
    @PostMapping
    public TopicBridge1982 create(@RequestBody TopicBridge1982 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed TopicBridge1982";
    }
}
