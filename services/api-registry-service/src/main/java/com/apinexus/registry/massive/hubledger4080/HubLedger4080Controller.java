package com.apinexus.registry.massive.hubledger4080;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubledger4080")
public class HubLedger4080Controller {
    private final HubLedger4080Service service;
    
    public HubLedger4080Controller(HubLedger4080Service service) { this.service = service; }
    
    @GetMapping
    public List<HubLedger4080> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubLedger4080 create(@RequestBody HubLedger4080 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubLedger4080";
    }
}
