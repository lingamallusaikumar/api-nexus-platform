package com.apinexus.registry.massive.mesharray4063;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/mesharray4063")
public class MeshArray4063Controller {
    private final MeshArray4063Service service;
    
    public MeshArray4063Controller(MeshArray4063Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshArray4063> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshArray4063 create(@RequestBody MeshArray4063 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshArray4063";
    }
}
