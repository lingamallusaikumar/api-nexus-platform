package com.apinexus.registry.massive.physicaledge8220;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/physicaledge8220")
public class PhysicalEdge8220Controller {
    private final PhysicalEdge8220Service service;
    
    public PhysicalEdge8220Controller(PhysicalEdge8220Service service) { this.service = service; }
    
    @GetMapping
    public List<PhysicalEdge8220> getAll() { return service.findAll(); }
    
    @PostMapping
    public PhysicalEdge8220 create(@RequestBody PhysicalEdge8220 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed PhysicalEdge8220";
    }
}
