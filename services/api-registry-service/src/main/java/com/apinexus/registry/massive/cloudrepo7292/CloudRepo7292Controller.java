package com.apinexus.registry.massive.cloudrepo7292;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cloudrepo7292")
public class CloudRepo7292Controller {
    private final CloudRepo7292Service service;
    
    public CloudRepo7292Controller(CloudRepo7292Service service) { this.service = service; }
    
    @GetMapping
    public List<CloudRepo7292> getAll() { return service.findAll(); }
    
    @PostMapping
    public CloudRepo7292 create(@RequestBody CloudRepo7292 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CloudRepo7292";
    }
}
