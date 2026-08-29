package com.apinexus.registry.massive.messagepool4214;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/messagepool4214")
public class MessagePool4214Controller {
    private final MessagePool4214Service service;
    
    public MessagePool4214Controller(MessagePool4214Service service) { this.service = service; }
    
    @GetMapping
    public List<MessagePool4214> getAll() { return service.findAll(); }
    
    @PostMapping
    public MessagePool4214 create(@RequestBody MessagePool4214 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MessagePool4214";
    }
}
