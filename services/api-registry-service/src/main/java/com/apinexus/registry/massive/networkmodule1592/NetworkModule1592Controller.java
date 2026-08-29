package com.apinexus.registry.massive.networkmodule1592;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/networkmodule1592")
public class NetworkModule1592Controller {
    private final NetworkModule1592Service service;
    
    public NetworkModule1592Controller(NetworkModule1592Service service) { this.service = service; }
    
    @GetMapping
    public List<NetworkModule1592> getAll() { return service.findAll(); }
    
    @PostMapping
    public NetworkModule1592 create(@RequestBody NetworkModule1592 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NetworkModule1592";
    }
}
