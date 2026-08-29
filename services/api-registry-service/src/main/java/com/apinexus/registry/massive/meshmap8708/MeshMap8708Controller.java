package com.apinexus.registry.massive.meshmap8708;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshmap8708")
public class MeshMap8708Controller {
    private final MeshMap8708Service service;
    
    public MeshMap8708Controller(MeshMap8708Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshMap8708> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshMap8708 create(@RequestBody MeshMap8708 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshMap8708";
    }
}
