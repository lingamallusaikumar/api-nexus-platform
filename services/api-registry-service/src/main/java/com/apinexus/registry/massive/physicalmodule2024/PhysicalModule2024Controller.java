package com.apinexus.registry.massive.physicalmodule2024;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/physicalmodule2024")
public class PhysicalModule2024Controller {
    private final PhysicalModule2024Service service;
    
    public PhysicalModule2024Controller(PhysicalModule2024Service service) { this.service = service; }
    
    @GetMapping
    public List<PhysicalModule2024> getAll() { return service.findAll(); }
    
    @PostMapping
    public PhysicalModule2024 create(@RequestBody PhysicalModule2024 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed PhysicalModule2024";
    }
}
