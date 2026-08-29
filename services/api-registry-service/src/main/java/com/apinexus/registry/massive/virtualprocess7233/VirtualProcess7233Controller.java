package com.apinexus.registry.massive.virtualprocess7233;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualprocess7233")
public class VirtualProcess7233Controller {
    private final VirtualProcess7233Service service;
    
    public VirtualProcess7233Controller(VirtualProcess7233Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualProcess7233> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualProcess7233 create(@RequestBody VirtualProcess7233 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualProcess7233";
    }
}
