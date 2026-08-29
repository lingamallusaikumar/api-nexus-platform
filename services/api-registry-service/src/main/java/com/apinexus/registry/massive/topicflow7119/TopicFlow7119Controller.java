package com.apinexus.registry.massive.topicflow7119;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/topicflow7119")
public class TopicFlow7119Controller {
    private final TopicFlow7119Service service;
    
    public TopicFlow7119Controller(TopicFlow7119Service service) { this.service = service; }
    
    @GetMapping
    public List<TopicFlow7119> getAll() { return service.findAll(); }
    
    @PostMapping
    public TopicFlow7119 create(@RequestBody TopicFlow7119 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed TopicFlow7119";
    }
}
