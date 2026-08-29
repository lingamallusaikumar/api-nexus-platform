package com.apinexus.registry.massive.cloudlog8695;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cloudlog8695")
public class CloudLog8695Controller {
    private final CloudLog8695Service service;
    
    public CloudLog8695Controller(CloudLog8695Service service) { this.service = service; }
    
    @GetMapping
    public List<CloudLog8695> getAll() { return service.findAll(); }
    
    @PostMapping
    public CloudLog8695 create(@RequestBody CloudLog8695 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CloudLog8695";
    }
}
