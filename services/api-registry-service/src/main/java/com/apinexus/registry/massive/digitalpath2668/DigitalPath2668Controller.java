package com.apinexus.registry.massive.digitalpath2668;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalpath2668")
public class DigitalPath2668Controller {
    private final DigitalPath2668Service service;
    
    public DigitalPath2668Controller(DigitalPath2668Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalPath2668> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalPath2668 create(@RequestBody DigitalPath2668 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalPath2668";
    }
}
