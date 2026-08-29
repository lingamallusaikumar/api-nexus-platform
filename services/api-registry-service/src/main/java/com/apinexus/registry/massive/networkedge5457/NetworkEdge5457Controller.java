package com.apinexus.registry.massive.networkedge5457;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/networkedge5457")
public class NetworkEdge5457Controller {
    private final NetworkEdge5457Service service;
    
    public NetworkEdge5457Controller(NetworkEdge5457Service service) { this.service = service; }
    
    @GetMapping
    public List<NetworkEdge5457> getAll() { return service.findAll(); }
    
    @PostMapping
    public NetworkEdge5457 create(@RequestBody NetworkEdge5457 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NetworkEdge5457";
    }
}
