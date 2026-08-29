package com.apinexus.registry.massive.virtualjob9029;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualjob9029")
public class VirtualJob9029Controller {
    private final VirtualJob9029Service service;
    
    public VirtualJob9029Controller(VirtualJob9029Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualJob9029> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualJob9029 create(@RequestBody VirtualJob9029 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualJob9029";
    }
}
