package com.apinexus.registry.massive.digitalstore6347;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalstore6347")
public class DigitalStore6347Controller {
    private final DigitalStore6347Service service;
    
    public DigitalStore6347Controller(DigitalStore6347Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalStore6347> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalStore6347 create(@RequestBody DigitalStore6347 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalStore6347";
    }
}
