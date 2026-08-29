package com.apinexus.registry.massive.switchdatabase4262;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/switchdatabase4262")
public class SwitchDatabase4262Controller {
    private final SwitchDatabase4262Service service;
    
    public SwitchDatabase4262Controller(SwitchDatabase4262Service service) { this.service = service; }
    
    @GetMapping
    public List<SwitchDatabase4262> getAll() { return service.findAll(); }
    
    @PostMapping
    public SwitchDatabase4262 create(@RequestBody SwitchDatabase4262 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SwitchDatabase4262";
    }
}
