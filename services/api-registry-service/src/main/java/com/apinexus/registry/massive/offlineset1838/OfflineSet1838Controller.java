package com.apinexus.registry.massive.offlineset1838;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/offlineset1838")
public class OfflineSet1838Controller {
    private final OfflineSet1838Service service;
    
    public OfflineSet1838Controller(OfflineSet1838Service service) { this.service = service; }
    
    @GetMapping
    public List<OfflineSet1838> getAll() { return service.findAll(); }
    
    @PostMapping
    public OfflineSet1838 create(@RequestBody OfflineSet1838 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OfflineSet1838";
    }
}
