package com.apinexus.registry.massive.digitalprocess7489;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalprocess7489")
public class DigitalProcess7489Controller {
    private final DigitalProcess7489Service service;
    
    public DigitalProcess7489Controller(DigitalProcess7489Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalProcess7489> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalProcess7489 create(@RequestBody DigitalProcess7489 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalProcess7489";
    }
}
