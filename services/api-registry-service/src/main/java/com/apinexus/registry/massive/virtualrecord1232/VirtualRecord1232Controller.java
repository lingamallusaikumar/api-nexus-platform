package com.apinexus.registry.massive.virtualrecord1232;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualrecord1232")
public class VirtualRecord1232Controller {
    private final VirtualRecord1232Service service;
    
    public VirtualRecord1232Controller(VirtualRecord1232Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualRecord1232> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualRecord1232 create(@RequestBody VirtualRecord1232 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualRecord1232";
    }
}
