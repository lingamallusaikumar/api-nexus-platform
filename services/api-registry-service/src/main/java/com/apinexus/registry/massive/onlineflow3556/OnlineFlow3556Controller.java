package com.apinexus.registry.massive.onlineflow3556;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/onlineflow3556")
public class OnlineFlow3556Controller {
    private final OnlineFlow3556Service service;
    
    public OnlineFlow3556Controller(OnlineFlow3556Service service) { this.service = service; }
    
    @GetMapping
    public List<OnlineFlow3556> getAll() { return service.findAll(); }
    
    @PostMapping
    public OnlineFlow3556 create(@RequestBody OnlineFlow3556 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OnlineFlow3556";
    }
}
