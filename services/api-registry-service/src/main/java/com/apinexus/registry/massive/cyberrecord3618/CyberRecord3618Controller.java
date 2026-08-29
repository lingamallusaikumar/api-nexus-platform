package com.apinexus.registry.massive.cyberrecord3618;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cyberrecord3618")
public class CyberRecord3618Controller {
    private final CyberRecord3618Service service;
    
    public CyberRecord3618Controller(CyberRecord3618Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberRecord3618> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberRecord3618 create(@RequestBody CyberRecord3618 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberRecord3618";
    }
}
