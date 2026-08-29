package com.apinexus.registry.massive.switchmap9217;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/switchmap9217")
public class SwitchMap9217Controller {
    private final SwitchMap9217Service service;
    
    public SwitchMap9217Controller(SwitchMap9217Service service) { this.service = service; }
    
    @GetMapping
    public List<SwitchMap9217> getAll() { return service.findAll(); }
    
    @PostMapping
    public SwitchMap9217 create(@RequestBody SwitchMap9217 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SwitchMap9217";
    }
}
