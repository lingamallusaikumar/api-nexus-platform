package com.apinexus.registry.massive.virtualpath8957;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualpath8957")
public class VirtualPath8957Controller {
    private final VirtualPath8957Service service;
    
    public VirtualPath8957Controller(VirtualPath8957Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualPath8957> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualPath8957 create(@RequestBody VirtualPath8957 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualPath8957";
    }
}
