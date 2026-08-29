package com.apinexus.registry.massive.dynamicpool9127;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dynamicpool9127")
public class DynamicPool9127Controller {
    private final DynamicPool9127Service service;
    
    public DynamicPool9127Controller(DynamicPool9127Service service) { this.service = service; }
    
    @GetMapping
    public List<DynamicPool9127> getAll() { return service.findAll(); }
    
    @PostMapping
    public DynamicPool9127 create(@RequestBody DynamicPool9127 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DynamicPool9127";
    }
}
