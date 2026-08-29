package com.apinexus.registry.massive.digitalbridge3641;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalbridge3641")
public class DigitalBridge3641Controller {
    private final DigitalBridge3641Service service;
    
    public DigitalBridge3641Controller(DigitalBridge3641Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalBridge3641> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalBridge3641 create(@RequestBody DigitalBridge3641 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalBridge3641";
    }
}
