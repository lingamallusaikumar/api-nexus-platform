package com.apinexus.registry.massive.offlinemodule1148;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/offlinemodule1148")
public class OfflineModule1148Controller {
    private final OfflineModule1148Service service;
    
    public OfflineModule1148Controller(OfflineModule1148Service service) { this.service = service; }
    
    @GetMapping
    public List<OfflineModule1148> getAll() { return service.findAll(); }
    
    @PostMapping
    public OfflineModule1148 create(@RequestBody OfflineModule1148 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OfflineModule1148";
    }
}
