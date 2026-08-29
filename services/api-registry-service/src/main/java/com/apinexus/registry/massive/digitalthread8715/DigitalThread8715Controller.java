package com.apinexus.registry.massive.digitalthread8715;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalthread8715")
public class DigitalThread8715Controller {
    private final DigitalThread8715Service service;
    
    public DigitalThread8715Controller(DigitalThread8715Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalThread8715> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalThread8715 create(@RequestBody DigitalThread8715 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalThread8715";
    }
}
