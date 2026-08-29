package com.apinexus.registry.massive.messagecomponent9438;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/messagecomponent9438")
public class MessageComponent9438Controller {
    private final MessageComponent9438Service service;
    
    public MessageComponent9438Controller(MessageComponent9438Service service) { this.service = service; }
    
    @GetMapping
    public List<MessageComponent9438> getAll() { return service.findAll(); }
    
    @PostMapping
    public MessageComponent9438 create(@RequestBody MessageComponent9438 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MessageComponent9438";
    }
}
