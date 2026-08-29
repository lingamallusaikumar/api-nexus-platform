package com.apinexus.registry.massive.onlinecache5705;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/onlinecache5705")
public class OnlineCache5705Controller {
    private final OnlineCache5705Service service;
    
    public OnlineCache5705Controller(OnlineCache5705Service service) { this.service = service; }
    
    @GetMapping
    public List<OnlineCache5705> getAll() { return service.findAll(); }
    
    @PostMapping
    public OnlineCache5705 create(@RequestBody OnlineCache5705 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OnlineCache5705";
    }
}
