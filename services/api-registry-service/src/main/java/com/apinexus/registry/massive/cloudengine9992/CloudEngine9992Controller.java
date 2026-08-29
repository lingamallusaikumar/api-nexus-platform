package com.apinexus.registry.massive.cloudengine9992;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cloudengine9992")
public class CloudEngine9992Controller {
    private final CloudEngine9992Service service;
    
    public CloudEngine9992Controller(CloudEngine9992Service service) { this.service = service; }
    
    @GetMapping
    public List<CloudEngine9992> getAll() { return service.findAll(); }
    
    @PostMapping
    public CloudEngine9992 create(@RequestBody CloudEngine9992 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CloudEngine9992";
    }
}
