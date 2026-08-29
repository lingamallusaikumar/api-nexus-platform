package com.apinexus.registry.massive.meshstack2786;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshstack2786")
public class MeshStack2786Controller {
    private final MeshStack2786Service service;
    
    public MeshStack2786Controller(MeshStack2786Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshStack2786> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshStack2786 create(@RequestBody MeshStack2786 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshStack2786";
    }
}
