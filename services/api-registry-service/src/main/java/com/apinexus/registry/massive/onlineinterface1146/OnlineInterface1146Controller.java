package com.apinexus.registry.massive.onlineinterface1146;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/onlineinterface1146")
public class OnlineInterface1146Controller {
    private final OnlineInterface1146Service service;
    
    public OnlineInterface1146Controller(OnlineInterface1146Service service) { this.service = service; }
    
    @GetMapping
    public List<OnlineInterface1146> getAll() { return service.findAll(); }
    
    @PostMapping
    public OnlineInterface1146 create(@RequestBody OnlineInterface1146 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OnlineInterface1146";
    }
}
