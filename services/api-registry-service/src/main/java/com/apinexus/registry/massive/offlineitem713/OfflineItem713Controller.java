package com.apinexus.registry.massive.offlineitem713;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/offlineitem713")
public class OfflineItem713Controller {
    private final OfflineItem713Service service;
    
    public OfflineItem713Controller(OfflineItem713Service service) { this.service = service; }
    
    @GetMapping
    public List<OfflineItem713> getAll() { return service.findAll(); }
    
    @PostMapping
    public OfflineItem713 create(@RequestBody OfflineItem713 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OfflineItem713";
    }
}
