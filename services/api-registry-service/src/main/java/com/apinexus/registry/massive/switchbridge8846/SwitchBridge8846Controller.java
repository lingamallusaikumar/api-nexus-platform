package com.apinexus.registry.massive.switchbridge8846;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/switchbridge8846")
public class SwitchBridge8846Controller {
    private final SwitchBridge8846Service service;
    
    public SwitchBridge8846Controller(SwitchBridge8846Service service) { this.service = service; }
    
    @GetMapping
    public List<SwitchBridge8846> getAll() { return service.findAll(); }
    
    @PostMapping
    public SwitchBridge8846 create(@RequestBody SwitchBridge8846 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SwitchBridge8846";
    }
}
