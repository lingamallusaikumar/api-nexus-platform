package com.apinexus.registry.massive.networkset4000;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/networkset4000")
public class NetworkSet4000Controller {
    private final NetworkSet4000Service service;
    
    public NetworkSet4000Controller(NetworkSet4000Service service) { this.service = service; }
    
    @GetMapping
    public List<NetworkSet4000> getAll() { return service.findAll(); }
    
    @PostMapping
    public NetworkSet4000 create(@RequestBody NetworkSet4000 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NetworkSet4000";
    }
}
