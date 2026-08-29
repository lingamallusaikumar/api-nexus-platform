package com.apinexus.registry.massive.networkset4464;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/networkset4464")
public class NetworkSet4464Controller {
    private final NetworkSet4464Service service;
    
    public NetworkSet4464Controller(NetworkSet4464Service service) { this.service = service; }
    
    @GetMapping
    public List<NetworkSet4464> getAll() { return service.findAll(); }
    
    @PostMapping
    public NetworkSet4464 create(@RequestBody NetworkSet4464 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NetworkSet4464";
    }
}
