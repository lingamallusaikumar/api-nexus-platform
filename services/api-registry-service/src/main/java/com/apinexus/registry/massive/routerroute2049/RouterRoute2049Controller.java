package com.apinexus.registry.massive.routerroute2049;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routerroute2049")
public class RouterRoute2049Controller {
    private final RouterRoute2049Service service;
    
    public RouterRoute2049Controller(RouterRoute2049Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterRoute2049> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterRoute2049 create(@RequestBody RouterRoute2049 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterRoute2049";
    }
}
