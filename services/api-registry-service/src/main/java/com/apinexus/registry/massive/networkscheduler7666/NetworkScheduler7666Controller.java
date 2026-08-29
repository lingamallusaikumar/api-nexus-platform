package com.apinexus.registry.massive.networkscheduler7666;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/networkscheduler7666")
public class NetworkScheduler7666Controller {
    private final NetworkScheduler7666Service service;
    
    public NetworkScheduler7666Controller(NetworkScheduler7666Service service) { this.service = service; }
    
    @GetMapping
    public List<NetworkScheduler7666> getAll() { return service.findAll(); }
    
    @PostMapping
    public NetworkScheduler7666 create(@RequestBody NetworkScheduler7666 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NetworkScheduler7666";
    }
}
