package com.apinexus.registry.massive.switchlog5582;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/switchlog5582")
public class SwitchLog5582Controller {
    private final SwitchLog5582Service service;
    
    public SwitchLog5582Controller(SwitchLog5582Service service) { this.service = service; }
    
    @GetMapping
    public List<SwitchLog5582> getAll() { return service.findAll(); }
    
    @PostMapping
    public SwitchLog5582 create(@RequestBody SwitchLog5582 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SwitchLog5582";
    }
}
