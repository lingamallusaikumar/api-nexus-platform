package com.apinexus.registry.massive.meshcache3203;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshcache3203")
public class MeshCache3203Controller {
    private final MeshCache3203Service service;
    
    public MeshCache3203Controller(MeshCache3203Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshCache3203> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshCache3203 create(@RequestBody MeshCache3203 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshCache3203";
    }
}
