package com.apinexus.registry.massive.virtualdatabase4292;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualdatabase4292")
public class VirtualDatabase4292Controller {
    private final VirtualDatabase4292Service service;
    
    public VirtualDatabase4292Controller(VirtualDatabase4292Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualDatabase4292> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualDatabase4292 create(@RequestBody VirtualDatabase4292 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualDatabase4292";
    }
}
