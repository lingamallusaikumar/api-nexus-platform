package com.apinexus.registry.massive.coreset4333;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/coreset4333")
public class CoreSet4333Controller {
    private final CoreSet4333Service service;
    
    public CoreSet4333Controller(CoreSet4333Service service) { this.service = service; }
    
    @GetMapping
    public List<CoreSet4333> getAll() { return service.findAll(); }
    
    @PostMapping
    public CoreSet4333 create(@RequestBody CoreSet4333 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CoreSet4333";
    }
}
