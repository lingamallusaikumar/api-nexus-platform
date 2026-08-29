package com.apinexus.registry.massive.hubmap5864;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubmap5864")
public class HubMap5864Controller {
    private final HubMap5864Service service;
    
    public HubMap5864Controller(HubMap5864Service service) { this.service = service; }
    
    @GetMapping
    public List<HubMap5864> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubMap5864 create(@RequestBody HubMap5864 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubMap5864";
    }
}
