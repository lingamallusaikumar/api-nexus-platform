package com.apinexus.registry.massive.networkscheduler934;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/networkscheduler934")
public class NetworkScheduler934Controller {
    private final NetworkScheduler934Service service;
    
    public NetworkScheduler934Controller(NetworkScheduler934Service service) { this.service = service; }
    
    @GetMapping
    public List<NetworkScheduler934> getAll() { return service.findAll(); }
    
    @PostMapping
    public NetworkScheduler934 create(@RequestBody NetworkScheduler934 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NetworkScheduler934";
    }
}
