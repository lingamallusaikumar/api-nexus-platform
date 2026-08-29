package com.apinexus.registry.massive.digitalqueue5619;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalqueue5619")
public class DigitalQueue5619Controller {
    private final DigitalQueue5619Service service;
    
    public DigitalQueue5619Controller(DigitalQueue5619Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalQueue5619> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalQueue5619 create(@RequestBody DigitalQueue5619 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalQueue5619";
    }
}
