package com.apinexus.registry.massive.meshrecord7387;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshrecord7387")
public class MeshRecord7387Controller {
    private final MeshRecord7387Service service;
    
    public MeshRecord7387Controller(MeshRecord7387Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshRecord7387> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshRecord7387 create(@RequestBody MeshRecord7387 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshRecord7387";
    }
}
