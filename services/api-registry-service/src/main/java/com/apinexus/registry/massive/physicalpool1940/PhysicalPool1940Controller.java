package com.apinexus.registry.massive.physicalpool1940;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/physicalpool1940")
public class PhysicalPool1940Controller {
    private final PhysicalPool1940Service service;
    
    public PhysicalPool1940Controller(PhysicalPool1940Service service) { this.service = service; }
    
    @GetMapping
    public List<PhysicalPool1940> getAll() { return service.findAll(); }
    
    @PostMapping
    public PhysicalPool1940 create(@RequestBody PhysicalPool1940 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed PhysicalPool1940";
    }
}
