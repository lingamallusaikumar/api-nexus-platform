package com.apinexus.registry.massive.meshnode1977;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshnode1977")
public class MeshNode1977Controller {
    private final MeshNode1977Service service;
    
    public MeshNode1977Controller(MeshNode1977Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshNode1977> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshNode1977 create(@RequestBody MeshNode1977 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshNode1977";
    }
}
