package com.apinexus.registry.massive.onlinearray8502;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/onlinearray8502")
public class OnlineArray8502Controller {
    private final OnlineArray8502Service service;
    
    public OnlineArray8502Controller(OnlineArray8502Service service) { this.service = service; }
    
    @GetMapping
    public List<OnlineArray8502> getAll() { return service.findAll(); }
    
    @PostMapping
    public OnlineArray8502 create(@RequestBody OnlineArray8502 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OnlineArray8502";
    }
}
