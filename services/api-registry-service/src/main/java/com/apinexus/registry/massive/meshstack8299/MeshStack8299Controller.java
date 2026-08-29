package com.apinexus.registry.massive.meshstack8299;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshstack8299")
public class MeshStack8299Controller {
    private final MeshStack8299Service service;
    
    public MeshStack8299Controller(MeshStack8299Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshStack8299> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshStack8299 create(@RequestBody MeshStack8299 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshStack8299";
    }
}
