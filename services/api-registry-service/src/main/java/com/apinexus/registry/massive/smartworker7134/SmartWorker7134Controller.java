package com.apinexus.registry.massive.smartworker7134;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/smartworker7134")
public class SmartWorker7134Controller {
    private final SmartWorker7134Service service;
    
    public SmartWorker7134Controller(SmartWorker7134Service service) { this.service = service; }
    
    @GetMapping
    public List<SmartWorker7134> getAll() { return service.findAll(); }
    
    @PostMapping
    public SmartWorker7134 create(@RequestBody SmartWorker7134 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SmartWorker7134";
    }
}
