package com.apinexus.registry.massive.smartbuffer5193;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/smartbuffer5193")
public class SmartBuffer5193Controller {
    private final SmartBuffer5193Service service;
    
    public SmartBuffer5193Controller(SmartBuffer5193Service service) { this.service = service; }
    
    @GetMapping
    public List<SmartBuffer5193> getAll() { return service.findAll(); }
    
    @PostMapping
    public SmartBuffer5193 create(@RequestBody SmartBuffer5193 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SmartBuffer5193";
    }
}
