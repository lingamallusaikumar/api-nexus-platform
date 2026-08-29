package com.apinexus.registry.massive.virtualscheduler9796;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualscheduler9796")
public class VirtualScheduler9796Controller {
    private final VirtualScheduler9796Service service;
    
    public VirtualScheduler9796Controller(VirtualScheduler9796Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualScheduler9796> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualScheduler9796 create(@RequestBody VirtualScheduler9796 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualScheduler9796";
    }
}
