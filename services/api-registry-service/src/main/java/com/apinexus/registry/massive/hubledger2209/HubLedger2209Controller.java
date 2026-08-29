package com.apinexus.registry.massive.hubledger2209;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubledger2209")
public class HubLedger2209Controller {
    private final HubLedger2209Service service;
    
    public HubLedger2209Controller(HubLedger2209Service service) { this.service = service; }
    
    @GetMapping
    public List<HubLedger2209> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubLedger2209 create(@RequestBody HubLedger2209 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubLedger2209";
    }
}
