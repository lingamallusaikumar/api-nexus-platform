package com.apinexus.registry.massive.meshengine4996;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshengine4996")
public class MeshEngine4996Controller {
    private final MeshEngine4996Service service;
    
    public MeshEngine4996Controller(MeshEngine4996Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshEngine4996> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshEngine4996 create(@RequestBody MeshEngine4996 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshEngine4996";
    }
}
