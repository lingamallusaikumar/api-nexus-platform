package com.apinexus.registry.massive.digitaldatabase256;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitaldatabase256")
public class DigitalDatabase256Controller {
    private final DigitalDatabase256Service service;
    
    public DigitalDatabase256Controller(DigitalDatabase256Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalDatabase256> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalDatabase256 create(@RequestBody DigitalDatabase256 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalDatabase256";
    }
}
