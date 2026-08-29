package com.apinexus.registry.massive.cloudinterface7802;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cloudinterface7802")
public class CloudInterface7802Controller {
    private final CloudInterface7802Service service;
    
    public CloudInterface7802Controller(CloudInterface7802Service service) { this.service = service; }
    
    @GetMapping
    public List<CloudInterface7802> getAll() { return service.findAll(); }
    
    @PostMapping
    public CloudInterface7802 create(@RequestBody CloudInterface7802 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CloudInterface7802";
    }
}
