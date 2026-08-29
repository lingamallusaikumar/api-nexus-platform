package com.apinexus.registry.massive.messagesystem2094;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/messagesystem2094")
public class MessageSystem2094Controller {
    private final MessageSystem2094Service service;
    
    public MessageSystem2094Controller(MessageSystem2094Service service) { this.service = service; }
    
    @GetMapping
    public List<MessageSystem2094> getAll() { return service.findAll(); }
    
    @PostMapping
    public MessageSystem2094 create(@RequestBody MessageSystem2094 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MessageSystem2094";
    }
}
