package com.apinexus.registry.massive.offlinebroker6342;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/offlinebroker6342")
public class OfflineBroker6342Controller {
    private final OfflineBroker6342Service service;
    
    public OfflineBroker6342Controller(OfflineBroker6342Service service) { this.service = service; }
    
    @GetMapping
    public List<OfflineBroker6342> getAll() { return service.findAll(); }
    
    @PostMapping
    public OfflineBroker6342 create(@RequestBody OfflineBroker6342 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OfflineBroker6342";
    }
}
