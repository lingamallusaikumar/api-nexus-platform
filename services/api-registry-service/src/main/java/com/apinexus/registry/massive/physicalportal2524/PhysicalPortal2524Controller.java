package com.apinexus.registry.massive.physicalportal2524;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/physicalportal2524")
public class PhysicalPortal2524Controller {
    private final PhysicalPortal2524Service service;
    
    public PhysicalPortal2524Controller(PhysicalPortal2524Service service) { this.service = service; }
    
    @GetMapping
    public List<PhysicalPortal2524> getAll() { return service.findAll(); }
    
    @PostMapping
    public PhysicalPortal2524 create(@RequestBody PhysicalPortal2524 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed PhysicalPortal2524";
    }
}
