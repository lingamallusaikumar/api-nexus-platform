package com.apinexus.registry.massive.cyberqueue4318;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cyberqueue4318")
public class CyberQueue4318Controller {
    private final CyberQueue4318Service service;
    
    public CyberQueue4318Controller(CyberQueue4318Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberQueue4318> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberQueue4318 create(@RequestBody CyberQueue4318 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberQueue4318";
    }
}
