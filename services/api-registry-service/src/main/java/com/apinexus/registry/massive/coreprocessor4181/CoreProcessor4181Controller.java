package com.apinexus.registry.massive.coreprocessor4181;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/coreprocessor4181")
public class CoreProcessor4181Controller {
    private final CoreProcessor4181Service service;
    
    public CoreProcessor4181Controller(CoreProcessor4181Service service) { this.service = service; }
    
    @GetMapping
    public List<CoreProcessor4181> getAll() { return service.findAll(); }
    
    @PostMapping
    public CoreProcessor4181 create(@RequestBody CoreProcessor4181 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CoreProcessor4181";
    }
}
