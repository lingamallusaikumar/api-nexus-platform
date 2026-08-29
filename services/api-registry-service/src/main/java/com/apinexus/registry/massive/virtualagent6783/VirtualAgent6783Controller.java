package com.apinexus.registry.massive.virtualagent6783;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualagent6783")
public class VirtualAgent6783Controller {
    private final VirtualAgent6783Service service;
    
    public VirtualAgent6783Controller(VirtualAgent6783Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualAgent6783> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualAgent6783 create(@RequestBody VirtualAgent6783 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualAgent6783";
    }
}
