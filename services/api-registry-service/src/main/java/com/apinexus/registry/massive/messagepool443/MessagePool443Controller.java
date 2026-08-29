package com.apinexus.registry.massive.messagepool443;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/messagepool443")
public class MessagePool443Controller {
    private final MessagePool443Service service;
    
    public MessagePool443Controller(MessagePool443Service service) { this.service = service; }
    
    @GetMapping
    public List<MessagePool443> getAll() { return service.findAll(); }
    
    @PostMapping
    public MessagePool443 create(@RequestBody MessagePool443 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MessagePool443";
    }
}
