package com.apinexus.registry.massive.messagedispatcher5017;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/messagedispatcher5017")
public class MessageDispatcher5017Controller {
    private final MessageDispatcher5017Service service;
    
    public MessageDispatcher5017Controller(MessageDispatcher5017Service service) { this.service = service; }
    
    @GetMapping
    public List<MessageDispatcher5017> getAll() { return service.findAll(); }
    
    @PostMapping
    public MessageDispatcher5017 create(@RequestBody MessageDispatcher5017 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MessageDispatcher5017";
    }
}
