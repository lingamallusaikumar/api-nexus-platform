package com.apinexus.registry.massive.networkworker2767;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/networkworker2767")
public class NetworkWorker2767Controller {
    private final NetworkWorker2767Service service;
    
    public NetworkWorker2767Controller(NetworkWorker2767Service service) { this.service = service; }
    
    @GetMapping
    public List<NetworkWorker2767> getAll() { return service.findAll(); }
    
    @PostMapping
    public NetworkWorker2767 create(@RequestBody NetworkWorker2767 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NetworkWorker2767";
    }
}
