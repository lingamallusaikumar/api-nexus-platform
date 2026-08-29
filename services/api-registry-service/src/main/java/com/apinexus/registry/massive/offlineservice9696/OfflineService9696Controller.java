package com.apinexus.registry.massive.offlineservice9696;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/offlineservice9696")
public class OfflineService9696Controller {
    private final OfflineService9696Service service;
    
    public OfflineService9696Controller(OfflineService9696Service service) { this.service = service; }
    
    @GetMapping
    public List<OfflineService9696> getAll() { return service.findAll(); }
    
    @PostMapping
    public OfflineService9696 create(@RequestBody OfflineService9696 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OfflineService9696";
    }
}
