package com.apinexus.registry.massive.topicrecord3987;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/topicrecord3987")
public class TopicRecord3987Controller {
    private final TopicRecord3987Service service;
    
    public TopicRecord3987Controller(TopicRecord3987Service service) { this.service = service; }
    
    @GetMapping
    public List<TopicRecord3987> getAll() { return service.findAll(); }
    
    @PostMapping
    public TopicRecord3987 create(@RequestBody TopicRecord3987 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed TopicRecord3987";
    }
}
