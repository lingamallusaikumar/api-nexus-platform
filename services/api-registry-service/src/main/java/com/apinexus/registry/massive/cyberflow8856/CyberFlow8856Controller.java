package com.apinexus.registry.massive.cyberflow8856;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cyberflow8856")
public class CyberFlow8856Controller {
    private final CyberFlow8856Service service;
    
    public CyberFlow8856Controller(CyberFlow8856Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberFlow8856> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberFlow8856 create(@RequestBody CyberFlow8856 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberFlow8856";
    }
}
