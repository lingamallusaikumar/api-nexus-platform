package com.apinexus.registry.massive.networkroute8104;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/networkroute8104")
public class NetworkRoute8104Controller {
    private final NetworkRoute8104Service service;
    
    public NetworkRoute8104Controller(NetworkRoute8104Service service) { this.service = service; }
    
    @GetMapping
    public List<NetworkRoute8104> getAll() { return service.findAll(); }
    
    @PostMapping
    public NetworkRoute8104 create(@RequestBody NetworkRoute8104 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NetworkRoute8104";
    }
}
