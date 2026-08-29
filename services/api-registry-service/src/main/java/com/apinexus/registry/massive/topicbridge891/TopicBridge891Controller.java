package com.apinexus.registry.massive.topicbridge891;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/topicbridge891")
public class TopicBridge891Controller {
    private final TopicBridge891Service service;
    
    public TopicBridge891Controller(TopicBridge891Service service) { this.service = service; }
    
    @GetMapping
    public List<TopicBridge891> getAll() { return service.findAll(); }
    
    @PostMapping
    public TopicBridge891 create(@RequestBody TopicBridge891 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed TopicBridge891";
    }
}
