package com.apinexus.registry.massive.networkworker9160;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/networkworker9160")
public class NetworkWorker9160Controller {
    private final NetworkWorker9160Service service;
    
    public NetworkWorker9160Controller(NetworkWorker9160Service service) { this.service = service; }
    
    @GetMapping
    public List<NetworkWorker9160> getAll() { return service.findAll(); }
    
    @PostMapping
    public NetworkWorker9160 create(@RequestBody NetworkWorker9160 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NetworkWorker9160";
    }
}
