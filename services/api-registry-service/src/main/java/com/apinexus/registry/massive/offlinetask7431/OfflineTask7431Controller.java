package com.apinexus.registry.massive.offlinetask7431;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/offlinetask7431")
public class OfflineTask7431Controller {
    private final OfflineTask7431Service service;
    
    public OfflineTask7431Controller(OfflineTask7431Service service) { this.service = service; }
    
    @GetMapping
    public List<OfflineTask7431> getAll() { return service.findAll(); }
    
    @PostMapping
    public OfflineTask7431 create(@RequestBody OfflineTask7431 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OfflineTask7431";
    }
}
