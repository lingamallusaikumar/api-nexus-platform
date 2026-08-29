package com.apinexus.registry.massive.meshpool484;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshpool484")
public class MeshPool484Controller {
    private final MeshPool484Service service;
    
    public MeshPool484Controller(MeshPool484Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshPool484> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshPool484 create(@RequestBody MeshPool484 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshPool484";
    }
}
