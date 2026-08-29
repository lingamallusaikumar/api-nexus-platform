package com.apinexus.registry.massive.hybridworker6742;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hybridworker6742")
public class HybridWorker6742Controller {
    private final HybridWorker6742Service service;
    
    public HybridWorker6742Controller(HybridWorker6742Service service) { this.service = service; }
    
    @GetMapping
    public List<HybridWorker6742> getAll() { return service.findAll(); }
    
    @PostMapping
    public HybridWorker6742 create(@RequestBody HybridWorker6742 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HybridWorker6742";
    }
}
