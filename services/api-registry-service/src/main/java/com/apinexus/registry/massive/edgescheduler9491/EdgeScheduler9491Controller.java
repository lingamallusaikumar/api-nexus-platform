package com.apinexus.registry.massive.edgescheduler9491;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgescheduler9491")
public class EdgeScheduler9491Controller {
    private final EdgeScheduler9491Service service;
    
    public EdgeScheduler9491Controller(EdgeScheduler9491Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeScheduler9491> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeScheduler9491 create(@RequestBody EdgeScheduler9491 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeScheduler9491";
    }
}
