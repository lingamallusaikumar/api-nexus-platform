package com.apinexus.registry.massive.offlineworker8444;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/offlineworker8444")
public class OfflineWorker8444Controller {
    private final OfflineWorker8444Service service;
    
    public OfflineWorker8444Controller(OfflineWorker8444Service service) { this.service = service; }
    
    @GetMapping
    public List<OfflineWorker8444> getAll() { return service.findAll(); }
    
    @PostMapping
    public OfflineWorker8444 create(@RequestBody OfflineWorker8444 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OfflineWorker8444";
    }
}
