package com.apinexus.registry.massive.messagetask9311;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/messagetask9311")
public class MessageTask9311Controller {
    private final MessageTask9311Service service;
    
    public MessageTask9311Controller(MessageTask9311Service service) { this.service = service; }
    
    @GetMapping
    public List<MessageTask9311> getAll() { return service.findAll(); }
    
    @PostMapping
    public MessageTask9311 create(@RequestBody MessageTask9311 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MessageTask9311";
    }
}
