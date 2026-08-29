package com.apinexus.registry.massive.messagegraph4351;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/messagegraph4351")
public class MessageGraph4351Controller {
    private final MessageGraph4351Service service;
    
    public MessageGraph4351Controller(MessageGraph4351Service service) { this.service = service; }
    
    @GetMapping
    public List<MessageGraph4351> getAll() { return service.findAll(); }
    
    @PostMapping
    public MessageGraph4351 create(@RequestBody MessageGraph4351 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MessageGraph4351";
    }
}
