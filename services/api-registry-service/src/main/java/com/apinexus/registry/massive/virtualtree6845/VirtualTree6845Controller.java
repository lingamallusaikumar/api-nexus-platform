package com.apinexus.registry.massive.virtualtree6845;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualtree6845")
public class VirtualTree6845Controller {
    private final VirtualTree6845Service service;
    
    public VirtualTree6845Controller(VirtualTree6845Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualTree6845> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualTree6845 create(@RequestBody VirtualTree6845 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualTree6845";
    }
}
