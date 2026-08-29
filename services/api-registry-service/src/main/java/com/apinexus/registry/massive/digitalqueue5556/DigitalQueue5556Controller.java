package com.apinexus.registry.massive.digitalqueue5556;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalqueue5556")
public class DigitalQueue5556Controller {
    private final DigitalQueue5556Service service;
    
    public DigitalQueue5556Controller(DigitalQueue5556Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalQueue5556> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalQueue5556 create(@RequestBody DigitalQueue5556 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalQueue5556";
    }
}
