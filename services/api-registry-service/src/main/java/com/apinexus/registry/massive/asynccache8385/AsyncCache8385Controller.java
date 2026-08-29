package com.apinexus.registry.massive.asynccache8385;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asynccache8385")
public class AsyncCache8385Controller {
    private final AsyncCache8385Service service;
    
    public AsyncCache8385Controller(AsyncCache8385Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncCache8385> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncCache8385 create(@RequestBody AsyncCache8385 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncCache8385";
    }
}
