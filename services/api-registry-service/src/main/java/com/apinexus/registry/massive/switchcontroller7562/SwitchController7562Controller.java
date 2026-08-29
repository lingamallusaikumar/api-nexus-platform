package com.apinexus.registry.massive.switchcontroller7562;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/switchcontroller7562")
public class SwitchController7562Controller {
    private final SwitchController7562Service service;
    
    public SwitchController7562Controller(SwitchController7562Service service) { this.service = service; }
    
    @GetMapping
    public List<SwitchController7562> getAll() { return service.findAll(); }
    
    @PostMapping
    public SwitchController7562 create(@RequestBody SwitchController7562 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SwitchController7562";
    }
}
