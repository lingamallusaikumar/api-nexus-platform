package com.apinexus.registry.massive.meshworker8358;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshworker8358")
public class MeshWorker8358Controller {
    private final MeshWorker8358Service service;
    
    public MeshWorker8358Controller(MeshWorker8358Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshWorker8358> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshWorker8358 create(@RequestBody MeshWorker8358 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshWorker8358";
    }
}
