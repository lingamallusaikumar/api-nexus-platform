package com.apinexus.registry.massive.physicalsystem5836;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/physicalsystem5836")
public class PhysicalSystem5836Controller {
    private final PhysicalSystem5836Service service;
    
    public PhysicalSystem5836Controller(PhysicalSystem5836Service service) { this.service = service; }
    
    @GetMapping
    public List<PhysicalSystem5836> getAll() { return service.findAll(); }
    
    @PostMapping
    public PhysicalSystem5836 create(@RequestBody PhysicalSystem5836 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed PhysicalSystem5836";
    }
}
