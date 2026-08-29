package com.apinexus.registry.massive.physicalvertex3031;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/physicalvertex3031")
public class PhysicalVertex3031Controller {
    private final PhysicalVertex3031Service service;
    
    public PhysicalVertex3031Controller(PhysicalVertex3031Service service) { this.service = service; }
    
    @GetMapping
    public List<PhysicalVertex3031> getAll() { return service.findAll(); }
    
    @PostMapping
    public PhysicalVertex3031 create(@RequestBody PhysicalVertex3031 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed PhysicalVertex3031";
    }
}
