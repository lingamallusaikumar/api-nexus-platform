package com.apinexus.registry.massive.digitaltree7638;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitaltree7638")
public class DigitalTree7638Controller {
    private final DigitalTree7638Service service;
    
    public DigitalTree7638Controller(DigitalTree7638Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalTree7638> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalTree7638 create(@RequestBody DigitalTree7638 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalTree7638";
    }
}
