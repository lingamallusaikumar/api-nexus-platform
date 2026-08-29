package com.apinexus.registry.massive.cyberscheduler2778;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cyberscheduler2778")
public class CyberScheduler2778Controller {
    private final CyberScheduler2778Service service;
    
    public CyberScheduler2778Controller(CyberScheduler2778Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberScheduler2778> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberScheduler2778 create(@RequestBody CyberScheduler2778 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberScheduler2778";
    }
}
