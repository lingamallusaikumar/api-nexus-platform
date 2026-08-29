package com.apinexus.registry.massive.digitalmap5332;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalmap5332")
public class DigitalMap5332Controller {
    private final DigitalMap5332Service service;
    
    public DigitalMap5332Controller(DigitalMap5332Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalMap5332> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalMap5332 create(@RequestBody DigitalMap5332 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalMap5332";
    }
}
