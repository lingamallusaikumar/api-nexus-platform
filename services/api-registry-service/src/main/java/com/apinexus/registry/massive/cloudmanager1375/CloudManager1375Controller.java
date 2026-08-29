package com.apinexus.registry.massive.cloudmanager1375;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cloudmanager1375")
public class CloudManager1375Controller {
    private final CloudManager1375Service service;
    
    public CloudManager1375Controller(CloudManager1375Service service) { this.service = service; }
    
    @GetMapping
    public List<CloudManager1375> getAll() { return service.findAll(); }
    
    @PostMapping
    public CloudManager1375 create(@RequestBody CloudManager1375 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CloudManager1375";
    }
}
