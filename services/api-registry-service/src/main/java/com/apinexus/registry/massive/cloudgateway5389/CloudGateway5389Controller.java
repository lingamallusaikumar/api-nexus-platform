package com.apinexus.registry.massive.cloudgateway5389;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cloudgateway5389")
public class CloudGateway5389Controller {
    private final CloudGateway5389Service service;
    
    public CloudGateway5389Controller(CloudGateway5389Service service) { this.service = service; }
    
    @GetMapping
    public List<CloudGateway5389> getAll() { return service.findAll(); }
    
    @PostMapping
    public CloudGateway5389 create(@RequestBody CloudGateway5389 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CloudGateway5389";
    }
}
