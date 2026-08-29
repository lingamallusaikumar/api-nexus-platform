package com.apinexus.registry.massive.offlinegraph6757;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/offlinegraph6757")
public class OfflineGraph6757Controller {
    private final OfflineGraph6757Service service;
    
    public OfflineGraph6757Controller(OfflineGraph6757Service service) { this.service = service; }
    
    @GetMapping
    public List<OfflineGraph6757> getAll() { return service.findAll(); }
    
    @PostMapping
    public OfflineGraph6757 create(@RequestBody OfflineGraph6757 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OfflineGraph6757";
    }
}
