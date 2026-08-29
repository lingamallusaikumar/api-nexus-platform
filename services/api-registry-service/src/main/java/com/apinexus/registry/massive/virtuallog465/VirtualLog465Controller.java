package com.apinexus.registry.massive.virtuallog465;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtuallog465")
public class VirtualLog465Controller {
    private final VirtualLog465Service service;
    
    public VirtualLog465Controller(VirtualLog465Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualLog465> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualLog465 create(@RequestBody VirtualLog465 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualLog465";
    }
}
