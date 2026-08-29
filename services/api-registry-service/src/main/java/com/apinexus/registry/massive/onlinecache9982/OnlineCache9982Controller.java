package com.apinexus.registry.massive.onlinecache9982;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/onlinecache9982")
public class OnlineCache9982Controller {
    private final OnlineCache9982Service service;
    
    public OnlineCache9982Controller(OnlineCache9982Service service) { this.service = service; }
    
    @GetMapping
    public List<OnlineCache9982> getAll() { return service.findAll(); }
    
    @PostMapping
    public OnlineCache9982 create(@RequestBody OnlineCache9982 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OnlineCache9982";
    }
}
