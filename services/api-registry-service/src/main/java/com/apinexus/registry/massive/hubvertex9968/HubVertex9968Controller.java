package com.apinexus.registry.massive.hubvertex9968;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubvertex9968")
public class HubVertex9968Controller {
    private final HubVertex9968Service service;
    
    public HubVertex9968Controller(HubVertex9968Service service) { this.service = service; }
    
    @GetMapping
    public List<HubVertex9968> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubVertex9968 create(@RequestBody HubVertex9968 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubVertex9968";
    }
}
