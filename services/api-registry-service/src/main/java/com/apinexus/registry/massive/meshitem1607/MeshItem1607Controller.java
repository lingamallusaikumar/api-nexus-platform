package com.apinexus.registry.massive.meshitem1607;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshitem1607")
public class MeshItem1607Controller {
    private final MeshItem1607Service service;
    
    public MeshItem1607Controller(MeshItem1607Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshItem1607> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshItem1607 create(@RequestBody MeshItem1607 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshItem1607";
    }
}
