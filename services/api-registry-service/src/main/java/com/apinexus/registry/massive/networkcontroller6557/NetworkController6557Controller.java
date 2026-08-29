package com.apinexus.registry.massive.networkcontroller6557;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/networkcontroller6557")
public class NetworkController6557Controller {
    private final NetworkController6557Service service;
    
    public NetworkController6557Controller(NetworkController6557Service service) { this.service = service; }
    
    @GetMapping
    public List<NetworkController6557> getAll() { return service.findAll(); }
    
    @PostMapping
    public NetworkController6557 create(@RequestBody NetworkController6557 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NetworkController6557";
    }
}
