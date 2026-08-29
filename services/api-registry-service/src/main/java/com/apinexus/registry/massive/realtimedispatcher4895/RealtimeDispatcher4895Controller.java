package com.apinexus.registry.massive.realtimedispatcher4895;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimedispatcher4895")
public class RealtimeDispatcher4895Controller {
    private final RealtimeDispatcher4895Service service;
    
    public RealtimeDispatcher4895Controller(RealtimeDispatcher4895Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeDispatcher4895> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeDispatcher4895 create(@RequestBody RealtimeDispatcher4895 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeDispatcher4895";
    }
}
