package com.apinexus.registry.massive.networkroute5257;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/networkroute5257")
public class NetworkRoute5257Controller {
    private final NetworkRoute5257Service service;
    
    public NetworkRoute5257Controller(NetworkRoute5257Service service) { this.service = service; }
    
    @GetMapping
    public List<NetworkRoute5257> getAll() { return service.findAll(); }
    
    @PostMapping
    public NetworkRoute5257 create(@RequestBody NetworkRoute5257 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NetworkRoute5257";
    }
}
