package com.apinexus.registry.massive.realtimedispatcher9459;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimedispatcher9459")
public class RealtimeDispatcher9459Controller {
    private final RealtimeDispatcher9459Service service;
    
    public RealtimeDispatcher9459Controller(RealtimeDispatcher9459Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeDispatcher9459> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeDispatcher9459 create(@RequestBody RealtimeDispatcher9459 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeDispatcher9459";
    }
}
