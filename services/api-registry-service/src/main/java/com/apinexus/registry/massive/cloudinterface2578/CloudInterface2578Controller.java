package com.apinexus.registry.massive.cloudinterface2578;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cloudinterface2578")
public class CloudInterface2578Controller {
    private final CloudInterface2578Service service;
    
    public CloudInterface2578Controller(CloudInterface2578Service service) { this.service = service; }
    
    @GetMapping
    public List<CloudInterface2578> getAll() { return service.findAll(); }
    
    @PostMapping
    public CloudInterface2578 create(@RequestBody CloudInterface2578 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CloudInterface2578";
    }
}
