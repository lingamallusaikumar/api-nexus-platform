package com.apinexus.registry.massive.virtualtask9944;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualtask9944")
public class VirtualTask9944Controller {
    private final VirtualTask9944Service service;
    
    public VirtualTask9944Controller(VirtualTask9944Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualTask9944> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualTask9944 create(@RequestBody VirtualTask9944 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualTask9944";
    }
}
