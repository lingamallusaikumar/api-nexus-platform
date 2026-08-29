package com.apinexus.registry.massive.networkstore7210;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/networkstore7210")
public class NetworkStore7210Controller {
    private final NetworkStore7210Service service;
    
    public NetworkStore7210Controller(NetworkStore7210Service service) { this.service = service; }
    
    @GetMapping
    public List<NetworkStore7210> getAll() { return service.findAll(); }
    
    @PostMapping
    public NetworkStore7210 create(@RequestBody NetworkStore7210 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NetworkStore7210";
    }
}
