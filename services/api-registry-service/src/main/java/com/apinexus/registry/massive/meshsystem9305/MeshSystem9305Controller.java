package com.apinexus.registry.massive.meshsystem9305;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshsystem9305")
public class MeshSystem9305Controller {
    private final MeshSystem9305Service service;
    
    public MeshSystem9305Controller(MeshSystem9305Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshSystem9305> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshSystem9305 create(@RequestBody MeshSystem9305 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshSystem9305";
    }
}
