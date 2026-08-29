package com.apinexus.registry.massive.networkmanager3434;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/networkmanager3434")
public class NetworkManager3434Controller {
    private final NetworkManager3434Service service;
    
    public NetworkManager3434Controller(NetworkManager3434Service service) { this.service = service; }
    
    @GetMapping
    public List<NetworkManager3434> getAll() { return service.findAll(); }
    
    @PostMapping
    public NetworkManager3434 create(@RequestBody NetworkManager3434 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NetworkManager3434";
    }
}
