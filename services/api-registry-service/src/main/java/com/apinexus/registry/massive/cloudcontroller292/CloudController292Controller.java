package com.apinexus.registry.massive.cloudcontroller292;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cloudcontroller292")
public class CloudController292Controller {
    private final CloudController292Service service;
    
    public CloudController292Controller(CloudController292Service service) { this.service = service; }
    
    @GetMapping
    public List<CloudController292> getAll() { return service.findAll(); }
    
    @PostMapping
    public CloudController292 create(@RequestBody CloudController292 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CloudController292";
    }
}
