package com.apinexus.registry.massive.physicalentry8281;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/physicalentry8281")
public class PhysicalEntry8281Controller {
    private final PhysicalEntry8281Service service;
    
    public PhysicalEntry8281Controller(PhysicalEntry8281Service service) { this.service = service; }
    
    @GetMapping
    public List<PhysicalEntry8281> getAll() { return service.findAll(); }
    
    @PostMapping
    public PhysicalEntry8281 create(@RequestBody PhysicalEntry8281 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed PhysicalEntry8281";
    }
}
