package com.apinexus.registry.massive.offlineroute5142;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/offlineroute5142")
public class OfflineRoute5142Controller {
    private final OfflineRoute5142Service service;
    
    public OfflineRoute5142Controller(OfflineRoute5142Service service) { this.service = service; }
    
    @GetMapping
    public List<OfflineRoute5142> getAll() { return service.findAll(); }
    
    @PostMapping
    public OfflineRoute5142 create(@RequestBody OfflineRoute5142 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OfflineRoute5142";
    }
}
