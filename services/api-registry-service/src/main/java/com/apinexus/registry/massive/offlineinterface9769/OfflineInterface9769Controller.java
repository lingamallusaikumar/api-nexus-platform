package com.apinexus.registry.massive.offlineinterface9769;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/offlineinterface9769")
public class OfflineInterface9769Controller {
    private final OfflineInterface9769Service service;
    
    public OfflineInterface9769Controller(OfflineInterface9769Service service) { this.service = service; }
    
    @GetMapping
    public List<OfflineInterface9769> getAll() { return service.findAll(); }
    
    @PostMapping
    public OfflineInterface9769 create(@RequestBody OfflineInterface9769 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OfflineInterface9769";
    }
}
