package com.apinexus.registry.massive.centralpool2316;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centralpool2316")
public class CentralPool2316Controller {
    private final CentralPool2316Service service;
    
    public CentralPool2316Controller(CentralPool2316Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralPool2316> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralPool2316 create(@RequestBody CentralPool2316 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralPool2316";
    }
}
