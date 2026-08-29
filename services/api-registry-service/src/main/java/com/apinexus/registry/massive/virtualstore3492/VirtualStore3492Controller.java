package com.apinexus.registry.massive.virtualstore3492;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualstore3492")
public class VirtualStore3492Controller {
    private final VirtualStore3492Service service;
    
    public VirtualStore3492Controller(VirtualStore3492Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualStore3492> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualStore3492 create(@RequestBody VirtualStore3492 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualStore3492";
    }
}
