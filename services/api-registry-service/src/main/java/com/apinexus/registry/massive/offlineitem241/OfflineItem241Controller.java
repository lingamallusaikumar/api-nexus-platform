package com.apinexus.registry.massive.offlineitem241;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/offlineitem241")
public class OfflineItem241Controller {
    private final OfflineItem241Service service;
    
    public OfflineItem241Controller(OfflineItem241Service service) { this.service = service; }
    
    @GetMapping
    public List<OfflineItem241> getAll() { return service.findAll(); }
    
    @PostMapping
    public OfflineItem241 create(@RequestBody OfflineItem241 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OfflineItem241";
    }
}
