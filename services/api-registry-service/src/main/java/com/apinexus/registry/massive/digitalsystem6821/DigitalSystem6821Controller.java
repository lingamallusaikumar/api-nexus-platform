package com.apinexus.registry.massive.digitalsystem6821;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalsystem6821")
public class DigitalSystem6821Controller {
    private final DigitalSystem6821Service service;
    
    public DigitalSystem6821Controller(DigitalSystem6821Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalSystem6821> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalSystem6821 create(@RequestBody DigitalSystem6821 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalSystem6821";
    }
}
