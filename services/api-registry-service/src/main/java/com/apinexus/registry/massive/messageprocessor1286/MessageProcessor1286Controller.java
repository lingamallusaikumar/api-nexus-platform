package com.apinexus.registry.massive.messageprocessor1286;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/messageprocessor1286")
public class MessageProcessor1286Controller {
    private final MessageProcessor1286Service service;
    
    public MessageProcessor1286Controller(MessageProcessor1286Service service) { this.service = service; }
    
    @GetMapping
    public List<MessageProcessor1286> getAll() { return service.findAll(); }
    
    @PostMapping
    public MessageProcessor1286 create(@RequestBody MessageProcessor1286 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MessageProcessor1286";
    }
}
