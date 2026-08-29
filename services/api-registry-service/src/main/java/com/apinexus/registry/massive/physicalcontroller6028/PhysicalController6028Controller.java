package com.apinexus.registry.massive.physicalcontroller6028;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/physicalcontroller6028")
public class PhysicalController6028Controller {
    private final PhysicalController6028Service service;
    
    public PhysicalController6028Controller(PhysicalController6028Service service) { this.service = service; }
    
    @GetMapping
    public List<PhysicalController6028> getAll() { return service.findAll(); }
    
    @PostMapping
    public PhysicalController6028 create(@RequestBody PhysicalController6028 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed PhysicalController6028";
    }
}
