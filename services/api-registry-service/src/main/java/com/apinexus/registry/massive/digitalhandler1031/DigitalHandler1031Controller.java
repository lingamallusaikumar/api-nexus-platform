package com.apinexus.registry.massive.digitalhandler1031;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalhandler1031")
public class DigitalHandler1031Controller {
    private final DigitalHandler1031Service service;
    
    public DigitalHandler1031Controller(DigitalHandler1031Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalHandler1031> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalHandler1031 create(@RequestBody DigitalHandler1031 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalHandler1031";
    }
}
