package com.apinexus.registry.massive.switchscheduler9642;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/switchscheduler9642")
public class SwitchScheduler9642Controller {
    private final SwitchScheduler9642Service service;
    
    public SwitchScheduler9642Controller(SwitchScheduler9642Service service) { this.service = service; }
    
    @GetMapping
    public List<SwitchScheduler9642> getAll() { return service.findAll(); }
    
    @PostMapping
    public SwitchScheduler9642 create(@RequestBody SwitchScheduler9642 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SwitchScheduler9642";
    }
}
