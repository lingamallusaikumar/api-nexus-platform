package com.apinexus.registry.massive.offlinecontroller9099;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/offlinecontroller9099")
public class OfflineController9099Controller {
    private final OfflineController9099Service service;
    
    public OfflineController9099Controller(OfflineController9099Service service) { this.service = service; }
    
    @GetMapping
    public List<OfflineController9099> getAll() { return service.findAll(); }
    
    @PostMapping
    public OfflineController9099 create(@RequestBody OfflineController9099 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OfflineController9099";
    }
}
