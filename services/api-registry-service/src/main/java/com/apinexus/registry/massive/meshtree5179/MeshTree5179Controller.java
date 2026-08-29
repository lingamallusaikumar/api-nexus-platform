package com.apinexus.registry.massive.meshtree5179;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshtree5179")
public class MeshTree5179Controller {
    private final MeshTree5179Service service;
    
    public MeshTree5179Controller(MeshTree5179Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshTree5179> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshTree5179 create(@RequestBody MeshTree5179 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshTree5179";
    }
}
