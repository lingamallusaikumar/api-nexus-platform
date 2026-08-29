package com.apinexus.registry.massive.topicflow1372;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/topicflow1372")
public class TopicFlow1372Controller {
    private final TopicFlow1372Service service;
    
    public TopicFlow1372Controller(TopicFlow1372Service service) { this.service = service; }
    
    @GetMapping
    public List<TopicFlow1372> getAll() { return service.findAll(); }
    
    @PostMapping
    public TopicFlow1372 create(@RequestBody TopicFlow1372 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed TopicFlow1372";
    }
}
