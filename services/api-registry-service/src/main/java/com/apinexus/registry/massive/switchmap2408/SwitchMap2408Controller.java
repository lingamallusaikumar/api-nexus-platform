package com.apinexus.registry.massive.switchmap2408;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/switchmap2408")
public class SwitchMap2408Controller {
    private final SwitchMap2408Service service;
    
    public SwitchMap2408Controller(SwitchMap2408Service service) { this.service = service; }
    
    @GetMapping
    public List<SwitchMap2408> getAll() { return service.findAll(); }
    
    @PostMapping
    public SwitchMap2408 create(@RequestBody SwitchMap2408 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SwitchMap2408";
    }
}
