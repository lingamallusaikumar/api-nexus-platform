package com.apinexus.registry.massive.cloudportal3712;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cloudportal3712")
public class CloudPortal3712Controller {
    private final CloudPortal3712Service service;
    
    public CloudPortal3712Controller(CloudPortal3712Service service) { this.service = service; }
    
    @GetMapping
    public List<CloudPortal3712> getAll() { return service.findAll(); }
    
    @PostMapping
    public CloudPortal3712 create(@RequestBody CloudPortal3712 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CloudPortal3712";
    }
}
