package com.apinexus.registry.massive.cloudnode7330;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cloudnode7330")
public class CloudNode7330Controller {
    private final CloudNode7330Service service;
    
    public CloudNode7330Controller(CloudNode7330Service service) { this.service = service; }
    
    @GetMapping
    public List<CloudNode7330> getAll() { return service.findAll(); }
    
    @PostMapping
    public CloudNode7330 create(@RequestBody CloudNode7330 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CloudNode7330";
    }
}
