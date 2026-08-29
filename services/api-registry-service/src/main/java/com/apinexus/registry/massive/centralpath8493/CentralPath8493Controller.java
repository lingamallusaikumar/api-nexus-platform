package com.apinexus.registry.massive.centralpath8493;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centralpath8493")
public class CentralPath8493Controller {
    private final CentralPath8493Service service;
    
    public CentralPath8493Controller(CentralPath8493Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralPath8493> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralPath8493 create(@RequestBody CentralPath8493 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralPath8493";
    }
}
