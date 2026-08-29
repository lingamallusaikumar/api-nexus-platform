package com.apinexus.registry.massive.digitalservice9493;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalservice9493")
public class DigitalService9493Controller {
    private final DigitalService9493Service service;
    
    public DigitalService9493Controller(DigitalService9493Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalService9493> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalService9493 create(@RequestBody DigitalService9493 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalService9493";
    }
}
