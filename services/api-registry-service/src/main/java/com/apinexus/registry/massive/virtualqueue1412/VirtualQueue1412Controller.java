package com.apinexus.registry.massive.virtualqueue1412;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualqueue1412")
public class VirtualQueue1412Controller {
    private final VirtualQueue1412Service service;
    
    public VirtualQueue1412Controller(VirtualQueue1412Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualQueue1412> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualQueue1412 create(@RequestBody VirtualQueue1412 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualQueue1412";
    }
}
