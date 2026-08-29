package com.apinexus.registry.massive.meshedge3171;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshedge3171")
public class MeshEdge3171Controller {
    private final MeshEdge3171Service service;
    
    public MeshEdge3171Controller(MeshEdge3171Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshEdge3171> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshEdge3171 create(@RequestBody MeshEdge3171 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshEdge3171";
    }
}
