package com.apinexus.registry.massive.smartworker8672;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/smartworker8672")
public class SmartWorker8672Controller {
    private final SmartWorker8672Service service;
    
    public SmartWorker8672Controller(SmartWorker8672Service service) { this.service = service; }
    
    @GetMapping
    public List<SmartWorker8672> getAll() { return service.findAll(); }
    
    @PostMapping
    public SmartWorker8672 create(@RequestBody SmartWorker8672 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SmartWorker8672";
    }
}
