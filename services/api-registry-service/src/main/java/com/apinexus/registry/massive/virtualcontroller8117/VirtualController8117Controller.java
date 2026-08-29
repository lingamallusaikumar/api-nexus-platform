package com.apinexus.registry.massive.virtualcontroller8117;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualcontroller8117")
public class VirtualController8117Controller {
    private final VirtualController8117Service service;
    
    public VirtualController8117Controller(VirtualController8117Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualController8117> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualController8117 create(@RequestBody VirtualController8117 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualController8117";
    }
}
