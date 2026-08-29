package com.apinexus.registry.massive.networkmap6229;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/networkmap6229")
public class NetworkMap6229Controller {
    private final NetworkMap6229Service service;
    
    public NetworkMap6229Controller(NetworkMap6229Service service) { this.service = service; }
    
    @GetMapping
    public List<NetworkMap6229> getAll() { return service.findAll(); }
    
    @PostMapping
    public NetworkMap6229 create(@RequestBody NetworkMap6229 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NetworkMap6229";
    }
}
