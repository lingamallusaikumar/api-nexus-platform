package com.apinexus.registry.massive.asyncengine4910;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asyncengine4910")
public class AsyncEngine4910Controller {
    private final AsyncEngine4910Service service;
    
    public AsyncEngine4910Controller(AsyncEngine4910Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncEngine4910> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncEngine4910 create(@RequestBody AsyncEngine4910 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncEngine4910";
    }
}
