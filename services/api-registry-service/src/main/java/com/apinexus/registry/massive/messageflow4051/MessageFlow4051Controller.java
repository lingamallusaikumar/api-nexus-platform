package com.apinexus.registry.massive.messageflow4051;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/messageflow4051")
public class MessageFlow4051Controller {
    private final MessageFlow4051Service service;
    
    public MessageFlow4051Controller(MessageFlow4051Service service) { this.service = service; }
    
    @GetMapping
    public List<MessageFlow4051> getAll() { return service.findAll(); }
    
    @PostMapping
    public MessageFlow4051 create(@RequestBody MessageFlow4051 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MessageFlow4051";
    }
}
