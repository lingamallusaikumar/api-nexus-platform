package com.apinexus.registry.massive.smartitem9418;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/smartitem9418")
public class SmartItem9418Controller {
    private final SmartItem9418Service service;
    
    public SmartItem9418Controller(SmartItem9418Service service) { this.service = service; }
    
    @GetMapping
    public List<SmartItem9418> getAll() { return service.findAll(); }
    
    @PostMapping
    public SmartItem9418 create(@RequestBody SmartItem9418 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SmartItem9418";
    }
}
