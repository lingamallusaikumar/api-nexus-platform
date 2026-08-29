package com.apinexus.registry.massive.cloudgraph9671;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cloudgraph9671")
public class CloudGraph9671Controller {
    private final CloudGraph9671Service service;
    
    public CloudGraph9671Controller(CloudGraph9671Service service) { this.service = service; }
    
    @GetMapping
    public List<CloudGraph9671> getAll() { return service.findAll(); }
    
    @PostMapping
    public CloudGraph9671 create(@RequestBody CloudGraph9671 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CloudGraph9671";
    }
}
