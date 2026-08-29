package com.apinexus.registry.massive.meshnode1752;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshnode1752")
public class MeshNode1752Controller {
    private final MeshNode1752Service service;
    
    public MeshNode1752Controller(MeshNode1752Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshNode1752> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshNode1752 create(@RequestBody MeshNode1752 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshNode1752";
    }
}
