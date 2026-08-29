package com.apinexus.registry.massive.networkcache1233;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/networkcache1233")
public class NetworkCache1233Controller {
    private final NetworkCache1233Service service;
    
    public NetworkCache1233Controller(NetworkCache1233Service service) { this.service = service; }
    
    @GetMapping
    public List<NetworkCache1233> getAll() { return service.findAll(); }
    
    @PostMapping
    public NetworkCache1233 create(@RequestBody NetworkCache1233 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NetworkCache1233";
    }
}
