package com.apinexus.registry.massive.virtualengine9696;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualengine9696")
public class VirtualEngine9696Controller {
    private final VirtualEngine9696Service service;
    
    public VirtualEngine9696Controller(VirtualEngine9696Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualEngine9696> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualEngine9696 create(@RequestBody VirtualEngine9696 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualEngine9696";
    }
}
