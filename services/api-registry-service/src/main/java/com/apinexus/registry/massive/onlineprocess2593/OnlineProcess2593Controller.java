package com.apinexus.registry.massive.onlineprocess2593;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/onlineprocess2593")
public class OnlineProcess2593Controller {
    private final OnlineProcess2593Service service;
    
    public OnlineProcess2593Controller(OnlineProcess2593Service service) { this.service = service; }
    
    @GetMapping
    public List<OnlineProcess2593> getAll() { return service.findAll(); }
    
    @PostMapping
    public OnlineProcess2593 create(@RequestBody OnlineProcess2593 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OnlineProcess2593";
    }
}
