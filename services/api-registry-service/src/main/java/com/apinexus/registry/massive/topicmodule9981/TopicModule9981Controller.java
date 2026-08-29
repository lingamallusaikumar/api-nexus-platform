package com.apinexus.registry.massive.topicmodule9981;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/topicmodule9981")
public class TopicModule9981Controller {
    private final TopicModule9981Service service;
    
    public TopicModule9981Controller(TopicModule9981Service service) { this.service = service; }
    
    @GetMapping
    public List<TopicModule9981> getAll() { return service.findAll(); }
    
    @PostMapping
    public TopicModule9981 create(@RequestBody TopicModule9981 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed TopicModule9981";
    }
}
