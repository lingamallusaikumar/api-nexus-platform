package com.apinexus.registry.massive.cloudarray4749;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cloudarray4749")
public class CloudArray4749Controller {
    private final CloudArray4749Service service;
    
    public CloudArray4749Controller(CloudArray4749Service service) { this.service = service; }
    
    @GetMapping
    public List<CloudArray4749> getAll() { return service.findAll(); }
    
    @PostMapping
    public CloudArray4749 create(@RequestBody CloudArray4749 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CloudArray4749";
    }
}
