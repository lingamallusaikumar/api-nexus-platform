package com.apinexus.registry.massive.virtualroute8849;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualroute8849")
public class VirtualRoute8849Controller {
    private final VirtualRoute8849Service service;
    
    public VirtualRoute8849Controller(VirtualRoute8849Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualRoute8849> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualRoute8849 create(@RequestBody VirtualRoute8849 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualRoute8849";
    }
}
