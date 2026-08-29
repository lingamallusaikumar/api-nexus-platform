package com.apinexus.registry.massive.topicpath8673;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/topicpath8673")
public class TopicPath8673Controller {
    private final TopicPath8673Service service;
    
    public TopicPath8673Controller(TopicPath8673Service service) { this.service = service; }
    
    @GetMapping
    public List<TopicPath8673> getAll() { return service.findAll(); }
    
    @PostMapping
    public TopicPath8673 create(@RequestBody TopicPath8673 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed TopicPath8673";
    }
}
