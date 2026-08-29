package com.apinexus.registry.massive.messagelink3256;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/messagelink3256")
public class MessageLink3256Controller {
    private final MessageLink3256Service service;
    
    public MessageLink3256Controller(MessageLink3256Service service) { this.service = service; }
    
    @GetMapping
    public List<MessageLink3256> getAll() { return service.findAll(); }
    
    @PostMapping
    public MessageLink3256 create(@RequestBody MessageLink3256 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MessageLink3256";
    }
}
