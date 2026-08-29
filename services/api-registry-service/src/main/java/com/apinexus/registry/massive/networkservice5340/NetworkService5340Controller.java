package com.apinexus.registry.massive.networkservice5340;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/networkservice5340")
public class NetworkService5340Controller {
    private final NetworkService5340Service service;
    
    public NetworkService5340Controller(NetworkService5340Service service) { this.service = service; }
    
    @GetMapping
    public List<NetworkService5340> getAll() { return service.findAll(); }
    
    @PostMapping
    public NetworkService5340 create(@RequestBody NetworkService5340 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NetworkService5340";
    }
}
