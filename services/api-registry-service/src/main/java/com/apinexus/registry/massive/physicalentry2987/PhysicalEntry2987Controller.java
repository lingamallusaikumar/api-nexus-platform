package com.apinexus.registry.massive.physicalentry2987;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/physicalentry2987")
public class PhysicalEntry2987Controller {
    private final PhysicalEntry2987Service service;
    
    public PhysicalEntry2987Controller(PhysicalEntry2987Service service) { this.service = service; }
    
    @GetMapping
    public List<PhysicalEntry2987> getAll() { return service.findAll(); }
    
    @PostMapping
    public PhysicalEntry2987 create(@RequestBody PhysicalEntry2987 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed PhysicalEntry2987";
    }
}
