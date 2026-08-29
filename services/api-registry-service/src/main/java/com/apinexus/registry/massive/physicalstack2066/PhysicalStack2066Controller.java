package com.apinexus.registry.massive.physicalstack2066;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/physicalstack2066")
public class PhysicalStack2066Controller {
    private final PhysicalStack2066Service service;
    
    public PhysicalStack2066Controller(PhysicalStack2066Service service) { this.service = service; }
    
    @GetMapping
    public List<PhysicalStack2066> getAll() { return service.findAll(); }
    
    @PostMapping
    public PhysicalStack2066 create(@RequestBody PhysicalStack2066 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed PhysicalStack2066";
    }
}
