package com.apinexus.registry.massive.meshdatabase3337;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshdatabase3337")
public class MeshDatabase3337Controller {
    private final MeshDatabase3337Service service;
    
    public MeshDatabase3337Controller(MeshDatabase3337Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshDatabase3337> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshDatabase3337 create(@RequestBody MeshDatabase3337 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshDatabase3337";
    }
}
