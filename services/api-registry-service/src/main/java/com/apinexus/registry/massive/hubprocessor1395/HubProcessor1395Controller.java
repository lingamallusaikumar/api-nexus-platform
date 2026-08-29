package com.apinexus.registry.massive.hubprocessor1395;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubprocessor1395")
public class HubProcessor1395Controller {
    private final HubProcessor1395Service service;
    
    public HubProcessor1395Controller(HubProcessor1395Service service) { this.service = service; }
    
    @GetMapping
    public List<HubProcessor1395> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubProcessor1395 create(@RequestBody HubProcessor1395 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubProcessor1395";
    }
}
