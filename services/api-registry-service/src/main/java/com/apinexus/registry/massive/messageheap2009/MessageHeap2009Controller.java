package com.apinexus.registry.massive.messageheap2009;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/messageheap2009")
public class MessageHeap2009Controller {
    private final MessageHeap2009Service service;
    
    public MessageHeap2009Controller(MessageHeap2009Service service) { this.service = service; }
    
    @GetMapping
    public List<MessageHeap2009> getAll() { return service.findAll(); }
    
    @PostMapping
    public MessageHeap2009 create(@RequestBody MessageHeap2009 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MessageHeap2009";
    }
}
