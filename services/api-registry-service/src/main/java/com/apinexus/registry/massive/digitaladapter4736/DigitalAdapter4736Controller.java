package com.apinexus.registry.massive.digitaladapter4736;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitaladapter4736")
public class DigitalAdapter4736Controller {
    private final DigitalAdapter4736Service service;
    
    public DigitalAdapter4736Controller(DigitalAdapter4736Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalAdapter4736> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalAdapter4736 create(@RequestBody DigitalAdapter4736 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalAdapter4736";
    }
}
