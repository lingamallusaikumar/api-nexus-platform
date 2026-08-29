package com.apinexus.registry.massive.topicengine709;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/topicengine709")
public class TopicEngine709Controller {
    private final TopicEngine709Service service;
    
    public TopicEngine709Controller(TopicEngine709Service service) { this.service = service; }
    
    @GetMapping
    public List<TopicEngine709> getAll() { return service.findAll(); }
    
    @PostMapping
    public TopicEngine709 create(@RequestBody TopicEngine709 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed TopicEngine709";
    }
}
