package com.apinexus.registry.massive.virtualgraph8616;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualgraph8616")
public class VirtualGraph8616Controller {
    private final VirtualGraph8616Service service;
    
    public VirtualGraph8616Controller(VirtualGraph8616Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualGraph8616> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualGraph8616 create(@RequestBody VirtualGraph8616 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualGraph8616";
    }
}
