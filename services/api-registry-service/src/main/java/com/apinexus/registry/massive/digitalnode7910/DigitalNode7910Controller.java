package com.apinexus.registry.massive.digitalnode7910;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalnode7910")
public class DigitalNode7910Controller {
    private final DigitalNode7910Service service;
    
    public DigitalNode7910Controller(DigitalNode7910Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalNode7910> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalNode7910 create(@RequestBody DigitalNode7910 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalNode7910";
    }
}
