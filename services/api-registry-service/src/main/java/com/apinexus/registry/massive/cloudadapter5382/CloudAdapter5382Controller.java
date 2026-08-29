package com.apinexus.registry.massive.cloudadapter5382;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cloudadapter5382")
public class CloudAdapter5382Controller {
    private final CloudAdapter5382Service service;
    
    public CloudAdapter5382Controller(CloudAdapter5382Service service) { this.service = service; }
    
    @GetMapping
    public List<CloudAdapter5382> getAll() { return service.findAll(); }
    
    @PostMapping
    public CloudAdapter5382 create(@RequestBody CloudAdapter5382 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CloudAdapter5382";
    }
}
