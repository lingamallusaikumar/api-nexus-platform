package com.apinexus.registry.massive.meshitem6927;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshitem6927")
public class MeshItem6927Controller {
    private final MeshItem6927Service service;
    
    public MeshItem6927Controller(MeshItem6927Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshItem6927> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshItem6927 create(@RequestBody MeshItem6927 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshItem6927";
    }
}
