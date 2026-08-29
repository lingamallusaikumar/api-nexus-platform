package com.apinexus.registry.massive.virtualentry3972;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualentry3972")
public class VirtualEntry3972Controller {
    private final VirtualEntry3972Service service;
    
    public VirtualEntry3972Controller(VirtualEntry3972Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualEntry3972> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualEntry3972 create(@RequestBody VirtualEntry3972 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualEntry3972";
    }
}
