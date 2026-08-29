package com.apinexus.registry.massive.physicalinterface2091;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/physicalinterface2091")
public class PhysicalInterface2091Controller {
    private final PhysicalInterface2091Service service;
    
    public PhysicalInterface2091Controller(PhysicalInterface2091Service service) { this.service = service; }
    
    @GetMapping
    public List<PhysicalInterface2091> getAll() { return service.findAll(); }
    
    @PostMapping
    public PhysicalInterface2091 create(@RequestBody PhysicalInterface2091 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed PhysicalInterface2091";
    }
}
