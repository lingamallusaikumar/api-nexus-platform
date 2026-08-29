package com.apinexus.registry.massive.realtimetask1720;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimetask1720")
public class RealtimeTask1720Controller {
    private final RealtimeTask1720Service service;
    
    public RealtimeTask1720Controller(RealtimeTask1720Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeTask1720> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeTask1720 create(@RequestBody RealtimeTask1720 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeTask1720";
    }
}
