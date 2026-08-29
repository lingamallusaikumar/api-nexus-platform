package com.apinexus.registry.massive.switchmanager6192;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/switchmanager6192")
public class SwitchManager6192Controller {
    private final SwitchManager6192Service service;
    
    public SwitchManager6192Controller(SwitchManager6192Service service) { this.service = service; }
    
    @GetMapping
    public List<SwitchManager6192> getAll() { return service.findAll(); }
    
    @PostMapping
    public SwitchManager6192 create(@RequestBody SwitchManager6192 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SwitchManager6192";
    }
}
