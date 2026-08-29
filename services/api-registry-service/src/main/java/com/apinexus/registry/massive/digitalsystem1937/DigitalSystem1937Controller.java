package com.apinexus.registry.massive.digitalsystem1937;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalsystem1937")
public class DigitalSystem1937Controller {
    private final DigitalSystem1937Service service;
    
    public DigitalSystem1937Controller(DigitalSystem1937Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalSystem1937> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalSystem1937 create(@RequestBody DigitalSystem1937 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalSystem1937";
    }
}
