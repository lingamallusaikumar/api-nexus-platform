package com.apinexus.registry.massive.networkmap3270;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/networkmap3270")
public class NetworkMap3270Controller {
    private final NetworkMap3270Service service;
    
    public NetworkMap3270Controller(NetworkMap3270Service service) { this.service = service; }
    
    @GetMapping
    public List<NetworkMap3270> getAll() { return service.findAll(); }
    
    @PostMapping
    public NetworkMap3270 create(@RequestBody NetworkMap3270 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NetworkMap3270";
    }
}
