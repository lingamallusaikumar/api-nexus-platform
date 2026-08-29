package com.apinexus.registry.massive.networkportal973;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/networkportal973")
public class NetworkPortal973Controller {
    private final NetworkPortal973Service service;
    
    public NetworkPortal973Controller(NetworkPortal973Service service) { this.service = service; }
    
    @GetMapping
    public List<NetworkPortal973> getAll() { return service.findAll(); }
    
    @PostMapping
    public NetworkPortal973 create(@RequestBody NetworkPortal973 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NetworkPortal973";
    }
}
