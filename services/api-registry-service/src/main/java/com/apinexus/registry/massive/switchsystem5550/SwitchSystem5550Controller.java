package com.apinexus.registry.massive.switchsystem5550;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/switchsystem5550")
public class SwitchSystem5550Controller {
    private final SwitchSystem5550Service service;
    
    public SwitchSystem5550Controller(SwitchSystem5550Service service) { this.service = service; }
    
    @GetMapping
    public List<SwitchSystem5550> getAll() { return service.findAll(); }
    
    @PostMapping
    public SwitchSystem5550 create(@RequestBody SwitchSystem5550 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SwitchSystem5550";
    }
}
