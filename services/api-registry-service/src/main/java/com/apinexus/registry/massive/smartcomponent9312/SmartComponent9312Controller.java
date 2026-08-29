package com.apinexus.registry.massive.smartcomponent9312;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/smartcomponent9312")
public class SmartComponent9312Controller {
    private final SmartComponent9312Service service;
    
    public SmartComponent9312Controller(SmartComponent9312Service service) { this.service = service; }
    
    @GetMapping
    public List<SmartComponent9312> getAll() { return service.findAll(); }
    
    @PostMapping
    public SmartComponent9312 create(@RequestBody SmartComponent9312 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SmartComponent9312";
    }
}
