package com.apinexus.registry.massive.meshscheduler6945;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshscheduler6945")
public class MeshScheduler6945Controller {
    private final MeshScheduler6945Service service;
    
    public MeshScheduler6945Controller(MeshScheduler6945Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshScheduler6945> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshScheduler6945 create(@RequestBody MeshScheduler6945 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshScheduler6945";
    }
}
