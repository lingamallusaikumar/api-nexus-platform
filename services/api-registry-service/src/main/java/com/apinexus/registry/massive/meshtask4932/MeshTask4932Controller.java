package com.apinexus.registry.massive.meshtask4932;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshtask4932")
public class MeshTask4932Controller {
    private final MeshTask4932Service service;
    
    public MeshTask4932Controller(MeshTask4932Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshTask4932> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshTask4932 create(@RequestBody MeshTask4932 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshTask4932";
    }
}
