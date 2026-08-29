package com.apinexus.registry.massive.centralset5543;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centralset5543")
public class CentralSet5543Controller {
    private final CentralSet5543Service service;
    
    public CentralSet5543Controller(CentralSet5543Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralSet5543> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralSet5543 create(@RequestBody CentralSet5543 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralSet5543";
    }
}
