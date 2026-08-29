package com.apinexus.registry.massive.autotask3414;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/autotask3414")
public class AutoTask3414Controller {
    private final AutoTask3414Service service;
    
    public AutoTask3414Controller(AutoTask3414Service service) { this.service = service; }
    
    @GetMapping
    public List<AutoTask3414> getAll() { return service.findAll(); }
    
    @PostMapping
    public AutoTask3414 create(@RequestBody AutoTask3414 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AutoTask3414";
    }
}
