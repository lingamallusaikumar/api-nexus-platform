package com.apinexus.registry.massive.cloudbridge6826;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cloudbridge6826")
public class CloudBridge6826Controller {
    private final CloudBridge6826Service service;
    
    public CloudBridge6826Controller(CloudBridge6826Service service) { this.service = service; }
    
    @GetMapping
    public List<CloudBridge6826> getAll() { return service.findAll(); }
    
    @PostMapping
    public CloudBridge6826 create(@RequestBody CloudBridge6826 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CloudBridge6826";
    }
}
