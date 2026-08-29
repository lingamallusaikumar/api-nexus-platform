package com.apinexus.registry.massive.centralscheduler4185;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centralscheduler4185")
public class CentralScheduler4185Controller {
    private final CentralScheduler4185Service service;
    
    public CentralScheduler4185Controller(CentralScheduler4185Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralScheduler4185> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralScheduler4185 create(@RequestBody CentralScheduler4185 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralScheduler4185";
    }
}
