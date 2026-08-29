package com.apinexus.registry.massive.meshpath6965;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshpath6965")
public class MeshPath6965Controller {
    private final MeshPath6965Service service;
    
    public MeshPath6965Controller(MeshPath6965Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshPath6965> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshPath6965 create(@RequestBody MeshPath6965 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshPath6965";
    }
}
