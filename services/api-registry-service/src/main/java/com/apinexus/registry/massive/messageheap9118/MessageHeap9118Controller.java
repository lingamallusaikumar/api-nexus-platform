package com.apinexus.registry.massive.messageheap9118;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/messageheap9118")
public class MessageHeap9118Controller {
    private final MessageHeap9118Service service;
    
    public MessageHeap9118Controller(MessageHeap9118Service service) { this.service = service; }
    
    @GetMapping
    public List<MessageHeap9118> getAll() { return service.findAll(); }
    
    @PostMapping
    public MessageHeap9118 create(@RequestBody MessageHeap9118 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MessageHeap9118";
    }
}
