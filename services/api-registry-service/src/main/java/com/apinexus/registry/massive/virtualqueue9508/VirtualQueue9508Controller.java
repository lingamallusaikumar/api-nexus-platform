package com.apinexus.registry.massive.virtualqueue9508;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualqueue9508")
public class VirtualQueue9508Controller {
    private final VirtualQueue9508Service service;
    
    public VirtualQueue9508Controller(VirtualQueue9508Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualQueue9508> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualQueue9508 create(@RequestBody VirtualQueue9508 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualQueue9508";
    }
}
