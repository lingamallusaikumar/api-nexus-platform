package com.apinexus.registry.massive.cloudadapter5932;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cloudadapter5932")
public class CloudAdapter5932Controller {
    private final CloudAdapter5932Service service;
    
    public CloudAdapter5932Controller(CloudAdapter5932Service service) { this.service = service; }
    
    @GetMapping
    public List<CloudAdapter5932> getAll() { return service.findAll(); }
    
    @PostMapping
    public CloudAdapter5932 create(@RequestBody CloudAdapter5932 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CloudAdapter5932";
    }
}
