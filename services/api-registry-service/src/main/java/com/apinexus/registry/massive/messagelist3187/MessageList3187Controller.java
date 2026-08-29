package com.apinexus.registry.massive.messagelist3187;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/messagelist3187")
public class MessageList3187Controller {
    private final MessageList3187Service service;
    
    public MessageList3187Controller(MessageList3187Service service) { this.service = service; }
    
    @GetMapping
    public List<MessageList3187> getAll() { return service.findAll(); }
    
    @PostMapping
    public MessageList3187 create(@RequestBody MessageList3187 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MessageList3187";
    }
}
