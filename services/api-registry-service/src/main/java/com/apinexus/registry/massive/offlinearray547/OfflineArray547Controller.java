package com.apinexus.registry.massive.offlinearray547;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/offlinearray547")
public class OfflineArray547Controller {
    private final OfflineArray547Service service;
    
    public OfflineArray547Controller(OfflineArray547Service service) { this.service = service; }
    
    @GetMapping
    public List<OfflineArray547> getAll() { return service.findAll(); }
    
    @PostMapping
    public OfflineArray547 create(@RequestBody OfflineArray547 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OfflineArray547";
    }
}
