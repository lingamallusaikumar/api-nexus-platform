package com.apinexus.registry.massive.meshcache7171;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshcache7171")
public class MeshCache7171Controller {
    private final MeshCache7171Service service;
    
    public MeshCache7171Controller(MeshCache7171Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshCache7171> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshCache7171 create(@RequestBody MeshCache7171 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshCache7171";
    }
}
