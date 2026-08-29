package com.apinexus.registry.massive.networkgateway9205;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/networkgateway9205")
public class NetworkGateway9205Controller {
    private final NetworkGateway9205Service service;
    
    public NetworkGateway9205Controller(NetworkGateway9205Service service) { this.service = service; }
    
    @GetMapping
    public List<NetworkGateway9205> getAll() { return service.findAll(); }
    
    @PostMapping
    public NetworkGateway9205 create(@RequestBody NetworkGateway9205 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NetworkGateway9205";
    }
}
