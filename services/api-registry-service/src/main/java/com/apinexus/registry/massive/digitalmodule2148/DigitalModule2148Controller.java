package com.apinexus.registry.massive.digitalmodule2148;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalmodule2148")
public class DigitalModule2148Controller {
    private final DigitalModule2148Service service;
    
    public DigitalModule2148Controller(DigitalModule2148Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalModule2148> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalModule2148 create(@RequestBody DigitalModule2148 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalModule2148";
    }
}
