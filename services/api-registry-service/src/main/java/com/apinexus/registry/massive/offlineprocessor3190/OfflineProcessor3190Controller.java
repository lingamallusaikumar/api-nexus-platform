package com.apinexus.registry.massive.offlineprocessor3190;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/offlineprocessor3190")
public class OfflineProcessor3190Controller {
    private final OfflineProcessor3190Service service;
    
    public OfflineProcessor3190Controller(OfflineProcessor3190Service service) { this.service = service; }
    
    @GetMapping
    public List<OfflineProcessor3190> getAll() { return service.findAll(); }
    
    @PostMapping
    public OfflineProcessor3190 create(@RequestBody OfflineProcessor3190 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OfflineProcessor3190";
    }
}
