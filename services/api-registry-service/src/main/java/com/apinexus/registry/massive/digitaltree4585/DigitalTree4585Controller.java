package com.apinexus.registry.massive.digitaltree4585;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitaltree4585")
public class DigitalTree4585Controller {
    private final DigitalTree4585Service service;
    
    public DigitalTree4585Controller(DigitalTree4585Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalTree4585> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalTree4585 create(@RequestBody DigitalTree4585 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalTree4585";
    }
}
