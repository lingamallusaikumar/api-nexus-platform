package com.apinexus.registry.massive.centralengine1765;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centralengine1765")
public class CentralEngine1765Controller {
    private final CentralEngine1765Service service;
    
    public CentralEngine1765Controller(CentralEngine1765Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralEngine1765> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralEngine1765 create(@RequestBody CentralEngine1765 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralEngine1765";
    }
}
