package com.apinexus.registry.massive.offlineadapter2068;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/offlineadapter2068")
public class OfflineAdapter2068Controller {
    private final OfflineAdapter2068Service service;
    
    public OfflineAdapter2068Controller(OfflineAdapter2068Service service) { this.service = service; }
    
    @GetMapping
    public List<OfflineAdapter2068> getAll() { return service.findAll(); }
    
    @PostMapping
    public OfflineAdapter2068 create(@RequestBody OfflineAdapter2068 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OfflineAdapter2068";
    }
}
