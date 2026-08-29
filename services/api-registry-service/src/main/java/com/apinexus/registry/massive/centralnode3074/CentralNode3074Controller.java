package com.apinexus.registry.massive.centralnode3074;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centralnode3074")
public class CentralNode3074Controller {
    private final CentralNode3074Service service;
    
    public CentralNode3074Controller(CentralNode3074Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralNode3074> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralNode3074 create(@RequestBody CentralNode3074 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralNode3074";
    }
}
