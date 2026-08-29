package com.apinexus.registry.massive.digitalbridge693;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalbridge693")
public class DigitalBridge693Controller {
    private final DigitalBridge693Service service;
    
    public DigitalBridge693Controller(DigitalBridge693Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalBridge693> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalBridge693 create(@RequestBody DigitalBridge693 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalBridge693";
    }
}
