package com.apinexus.registry.massive.onlinedatabase1362;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/onlinedatabase1362")
public class OnlineDatabase1362Controller {
    private final OnlineDatabase1362Service service;
    
    public OnlineDatabase1362Controller(OnlineDatabase1362Service service) { this.service = service; }
    
    @GetMapping
    public List<OnlineDatabase1362> getAll() { return service.findAll(); }
    
    @PostMapping
    public OnlineDatabase1362 create(@RequestBody OnlineDatabase1362 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OnlineDatabase1362";
    }
}
