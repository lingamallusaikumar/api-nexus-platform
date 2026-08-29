package com.apinexus.registry.massive.networknode2786;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/networknode2786")
public class NetworkNode2786Controller {
    private final NetworkNode2786Service service;
    
    public NetworkNode2786Controller(NetworkNode2786Service service) { this.service = service; }
    
    @GetMapping
    public List<NetworkNode2786> getAll() { return service.findAll(); }
    
    @PostMapping
    public NetworkNode2786 create(@RequestBody NetworkNode2786 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NetworkNode2786";
    }
}
