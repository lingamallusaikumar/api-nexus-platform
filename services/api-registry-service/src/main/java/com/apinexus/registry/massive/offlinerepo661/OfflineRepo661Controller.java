package com.apinexus.registry.massive.offlinerepo661;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/offlinerepo661")
public class OfflineRepo661Controller {
    private final OfflineRepo661Service service;
    
    public OfflineRepo661Controller(OfflineRepo661Service service) { this.service = service; }
    
    @GetMapping
    public List<OfflineRepo661> getAll() { return service.findAll(); }
    
    @PostMapping
    public OfflineRepo661 create(@RequestBody OfflineRepo661 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OfflineRepo661";
    }
}
