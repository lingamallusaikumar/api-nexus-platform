package com.apinexus.registry.massive.routerscheduler5726;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routerscheduler5726")
public class RouterScheduler5726Controller {
    private final RouterScheduler5726Service service;
    
    public RouterScheduler5726Controller(RouterScheduler5726Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterScheduler5726> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterScheduler5726 create(@RequestBody RouterScheduler5726 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterScheduler5726";
    }
}
