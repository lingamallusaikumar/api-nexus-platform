package com.apinexus.registry.massive.virtualgraph7074;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualgraph7074")
public class VirtualGraph7074Controller {
    private final VirtualGraph7074Service service;
    
    public VirtualGraph7074Controller(VirtualGraph7074Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualGraph7074> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualGraph7074 create(@RequestBody VirtualGraph7074 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualGraph7074";
    }
}
