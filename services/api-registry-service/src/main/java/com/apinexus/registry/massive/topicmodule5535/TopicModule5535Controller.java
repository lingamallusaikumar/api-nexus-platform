package com.apinexus.registry.massive.topicmodule5535;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/topicmodule5535")
public class TopicModule5535Controller {
    private final TopicModule5535Service service;
    
    public TopicModule5535Controller(TopicModule5535Service service) { this.service = service; }
    
    @GetMapping
    public List<TopicModule5535> getAll() { return service.findAll(); }
    
    @PostMapping
    public TopicModule5535 create(@RequestBody TopicModule5535 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed TopicModule5535";
    }
}
