package com.apinexus.registry.massive.cloudcomponent6991;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cloudcomponent6991")
public class CloudComponent6991Controller {
    private final CloudComponent6991Service service;
    
    public CloudComponent6991Controller(CloudComponent6991Service service) { this.service = service; }
    
    @GetMapping
    public List<CloudComponent6991> getAll() { return service.findAll(); }
    
    @PostMapping
    public CloudComponent6991 create(@RequestBody CloudComponent6991 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CloudComponent6991";
    }
}
