package com.apinexus.registry.massive.virtualcache216;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualcache216")
public class VirtualCache216Controller {
    private final VirtualCache216Service service;
    
    public VirtualCache216Controller(VirtualCache216Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualCache216> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualCache216 create(@RequestBody VirtualCache216 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualCache216";
    }
}
