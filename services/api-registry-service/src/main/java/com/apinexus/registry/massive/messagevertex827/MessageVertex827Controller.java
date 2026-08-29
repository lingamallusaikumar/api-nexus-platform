package com.apinexus.registry.massive.messagevertex827;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/messagevertex827")
public class MessageVertex827Controller {
    private final MessageVertex827Service service;
    
    public MessageVertex827Controller(MessageVertex827Service service) { this.service = service; }
    
    @GetMapping
    public List<MessageVertex827> getAll() { return service.findAll(); }
    
    @PostMapping
    public MessageVertex827 create(@RequestBody MessageVertex827 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MessageVertex827";
    }
}
