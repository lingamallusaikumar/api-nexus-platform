package com.apinexus.registry.massive.meshpool3974;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshpool3974")
public class MeshPool3974Controller {
    private final MeshPool3974Service service;
    
    public MeshPool3974Controller(MeshPool3974Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshPool3974> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshPool3974 create(@RequestBody MeshPool3974 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshPool3974";
    }
}
