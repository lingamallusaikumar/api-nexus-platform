package com.apinexus.registry.massive.switchdatabase1552;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/switchdatabase1552")
public class SwitchDatabase1552Controller {
    private final SwitchDatabase1552Service service;
    
    public SwitchDatabase1552Controller(SwitchDatabase1552Service service) { this.service = service; }
    
    @GetMapping
    public List<SwitchDatabase1552> getAll() { return service.findAll(); }
    
    @PostMapping
    public SwitchDatabase1552 create(@RequestBody SwitchDatabase1552 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SwitchDatabase1552";
    }
}
