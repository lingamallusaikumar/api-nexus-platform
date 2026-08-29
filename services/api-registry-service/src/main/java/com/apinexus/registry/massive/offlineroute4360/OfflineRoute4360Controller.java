package com.apinexus.registry.massive.offlineroute4360;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/offlineroute4360")
public class OfflineRoute4360Controller {
    private final OfflineRoute4360Service service;
    
    public OfflineRoute4360Controller(OfflineRoute4360Service service) { this.service = service; }
    
    @GetMapping
    public List<OfflineRoute4360> getAll() { return service.findAll(); }
    
    @PostMapping
    public OfflineRoute4360 create(@RequestBody OfflineRoute4360 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OfflineRoute4360";
    }
}
