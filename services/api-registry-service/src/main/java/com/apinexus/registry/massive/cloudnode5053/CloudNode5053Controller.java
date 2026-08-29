package com.apinexus.registry.massive.cloudnode5053;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cloudnode5053")
public class CloudNode5053Controller {
    private final CloudNode5053Service service;
    
    public CloudNode5053Controller(CloudNode5053Service service) { this.service = service; }
    
    @GetMapping
    public List<CloudNode5053> getAll() { return service.findAll(); }
    
    @PostMapping
    public CloudNode5053 create(@RequestBody CloudNode5053 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CloudNode5053";
    }
}
