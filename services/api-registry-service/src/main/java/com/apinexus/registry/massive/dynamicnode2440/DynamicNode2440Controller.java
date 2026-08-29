package com.apinexus.registry.massive.dynamicnode2440;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dynamicnode2440")
public class DynamicNode2440Controller {
    private final DynamicNode2440Service service;
    
    public DynamicNode2440Controller(DynamicNode2440Service service) { this.service = service; }
    
    @GetMapping
    public List<DynamicNode2440> getAll() { return service.findAll(); }
    
    @PostMapping
    public DynamicNode2440 create(@RequestBody DynamicNode2440 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DynamicNode2440";
    }
}
